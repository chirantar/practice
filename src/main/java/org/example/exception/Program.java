package org.example.exception;

import org.example.exception.FileOperations.FileOperation;

public class Program {
    public static void main(String[] args) {
        FileOperation fp = null;
        try {
            fp = new FileOperation("test.py");
            fp.someFileOperation();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
