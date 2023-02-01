package com.base;

public class FileData implements Comparable<FileData> {
    private final String fileName;
    private final int sizeInBytes;
    private final String pathToFile;

    public FileData(String fileName, int sizeInBytes, String pathToFile) {
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
        this.pathToFile = pathToFile;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    @Override
    public String toString() {
        return "FileData{" + "fileName='" + fileName + '\'' + ", sizeInBytes=" + sizeInBytes + ", pathToFile='" + pathToFile + '\'' + '}';
    }

    @Override
    public int compareTo(FileData o) {
        return this.sizeInBytes - o.sizeInBytes;
    }
}
