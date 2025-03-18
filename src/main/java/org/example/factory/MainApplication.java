package org.example.factory;

import java.io.InputStream;

public class MainApplication {
    public static void main(String[] args) {
        CloudStorageFactory cloudStorageFactory = CloudStorageFactory.getCloudStorageService("AWS");
        InputStream inputStream = cloudStorageFactory.downloadFile("file.txt");
        System.out.println("Downloaded file: " + inputStream);
        cloudStorageFactory.deleteFile("file.txt");

    }
}
