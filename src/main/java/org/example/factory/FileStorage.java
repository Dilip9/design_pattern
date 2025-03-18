package org.example.factory;

import java.io.InputStream;

public interface FileStorage {

    public void uploadFile(String filePath, InputStream file);

    InputStream downloadFile(String filePath);

    void deleteFile(String filePath);

}
