package org.example.exception.FileOperations;

import lombok.Getter;
import lombok.Setter;
import org.example.exception.WrongFileNameException;

@Getter
public class FileOperation {
    String fileName;
    public FileOperation(String fileName) throws WrongFileNameException {
        if(!fileName.endsWith(".txt")){
          throw new WrongFileNameException("We only support .txt file extension");
        }
        this.fileName = fileName;
    }

    public void someFileOperation(){
        System.out.println("Some file ope");
    }
}
