package org.example.lld.loggingframework;

public class FileDestination implements LogDestination{
    private String filePath;
    public FileDestination(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void writeLog(String message) {
        // file Writing
    }
}
