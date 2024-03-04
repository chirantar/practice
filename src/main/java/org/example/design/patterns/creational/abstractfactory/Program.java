package org.example.design.patterns.creational.abstractfactory;

public class Program {
    public static void main(String[] args) {
        FileParserFactory textFileFactory = new TextFileParserfactory();
        FileParser fileParser = textFileFactory.getFileParser();

        FileParserFactory csvFileFactory = new CSVFileParserFactory();
        FileParser fileParser1 = csvFileFactory.getFileParser();


    }
}
