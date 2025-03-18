package org.example.factory;


import org.springframework.beans.factory.annotation.Value;

import java.io.InputStream;

public class AWSStorage implements FileStorage {

    private final S3Client s3Client;

    @Value("${aws.s3.bucketName}")
    private String bucketName;

    public AWSStorage() {
        this.s3Client = S3Client.create();
    }


    @Override
    public void uploadFile(String fileName, InputStream data) {
        try {
            s3Client.putObject(PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(fileName)
                    .build(), RequestBody.fromInputStream(data, data.available()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InputStream downloadFile(String filePath) {
        GetObjectRequest getObjectRequest = GetObjectRequest.builder()
                .bucket(bucketName)
                .key(filePath)
                .build();
        return s3Client.getObject(getObjectRequest);

    }

    @Override
    public void deleteFile(String filePath) {
        s3Client.deleteObject(DeleteObjectRequest.builder()
                .bucket(bucketName)
                .key(filePath)
                .build());
        System.out.println("File deleted successfully");
    }
}
