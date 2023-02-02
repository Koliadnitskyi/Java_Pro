package com.base;

public class FileData implements Comparable<FileData> {
    private final String fileName;
    private final int size;
    private final String pathToFile;

    public FileData(String fileName, int size, String pathToFile) {
        this.fileName = fileName;
        this.size = size;
        this.pathToFile = pathToFile;
    }

    public int getSize() {
        return size;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    @Override
    public String toString() {
        return "FileData{" + "fileName='" + fileName + '\'' + ", sizeInBytes=" + size + ", pathToFile='" + pathToFile + '\'' + '}';
    }

    @Override
    public int compareTo(FileData o) {
        return this.size - o.size;
    }
}
