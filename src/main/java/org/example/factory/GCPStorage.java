package org.example.factory;

import org.springframework.beans.factory.annotation.Value;

import java.io.InputStream;
import java.nio.channels.Channels;

public class GCPStorage implements FileStorage{
//
//    private final Storage storage;
//
//    @Value("${gcp.storage.bucketName}")
//    private String bucketName;
//
//    public GCPStorage() {
//        this.storage = StorageOptions.getDefaultInstance().getService();
//    }
//
//    @Override
//    public void uploadFile(String filePath, InputStream file) {
//        try {
//            BlobId blobId = BlobId.of(bucketName, filePath);
//            BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
//            storage.create(blobInfo, file.readAllBytes());
//            System.out.println("File uploaded successfully");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public InputStream downloadFile(String filePath) {
//        BlobId blobId = storage.get(BlobId.of(bucketName, filePath));
//        return Channels.newInputStream(blobId.reader());
//    }
//
//    @Override
//    public void deleteFile(String filePath) {
//        storage.delete(BlobId.of(bucketName, filePath));
//        System.out.println("File deleted successfully");
//
//    }
}
