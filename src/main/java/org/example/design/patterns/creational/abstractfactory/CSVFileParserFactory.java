package org.example.design.patterns.creational.abstractfactory;

public class CSVFileParserFactory extends FileParserFactory{
    @Override
    public FileParser createFileParser() {
        return new CSVFileParser();
    }
}
