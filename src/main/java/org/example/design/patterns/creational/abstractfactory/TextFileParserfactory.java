package org.example.design.patterns.creational.abstractfactory;

public class TextFileParserfactory extends FileParserFactory{
    @Override
    public FileParser createFileParser() {
        return new TextFileParser();
    }
}
