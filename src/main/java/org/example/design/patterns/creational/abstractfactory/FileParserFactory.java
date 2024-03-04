package org.example.design.patterns.creational.abstractfactory;

public abstract class FileParserFactory {
    public FileParser getFileParser(){
        return createFileParser();
    }

    public abstract FileParser createFileParser();
}
