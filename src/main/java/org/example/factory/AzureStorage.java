package org.example.factory;


import org.springframework.beans.factory.annotation.Value;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AzureStorage implements FileStorage{

    private final BlobServiceClient blobServiceClient;
    private final BlobContainerClient containerClient;

    @Value("${azure.storage.connectionString}")
    private  String connectionString;
    @Value("${azure.storage.containerName}")
    private  String containerName;

    public AzureStorage() {
        this.blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
        this.containerClient = blobServiceClient.getBlobContainerClient(containerName);
    }

    @Override
    public void uploadFile(String filePath, InputStream file) {
        try {
            BlobClient blobClient = containerClient.getBlobClient(filePath);
            blobClient.upload(file, file.available(), true);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public InputStream downloadFile(String filePath) {
        BlobClient blobClient = containerClient.getBlobClient(filePath);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(blobClient.downloadContent().toBytes());
        return inputStream;

    }

    @Override
    public void deleteFile(String filePath) {
        BlobClient blobClient = containerClient.getBlobClient(filePath);
        blobClient.delete();
        System.out.println("File deleted successfully");

    }
}
