package ru.otus.architect.test;

import ru.otus.architect.parser.IParser;
import ru.otus.architect.parser.Parser;
import ru.otus.architect.parser.concrete.CsvParser;
import ru.otus.architect.parser.concrete.JsonParser;
import ru.otus.architect.parser.concrete.TxtParser;
import ru.otus.architect.parser.concrete.XmlParser;

import java.util.ArrayList;
import java.util.List;

public class TestChain {
    public static void main(String[] args) {
        List<String> fileList = loadFiles();

        /*
        Цепочка обязанностей такая:
        JSON -> XML -> CSV -> TXT
         */
        IParser parser = new JsonParser();
        parser.setNextParser(new XmlParser())
              .setNextParser(new CsvParser())
              .setNextParser(new TxtParser());

        for (String fileName : fileList) {
            parser.parseFile(fileName);
        }
    }

    private static List<String> loadFiles() {
        List<String> fileList = new ArrayList<>();
        fileList.add("file.txt");
        fileList.add("file.json");
        fileList.add("file.doc");
        fileList.add("file.xml");
        fileList.add("file.csv");
        fileList.add("file.xml");
        fileList.add("file.json");
        fileList.add("file.pdf");

        return fileList;

    }
}
