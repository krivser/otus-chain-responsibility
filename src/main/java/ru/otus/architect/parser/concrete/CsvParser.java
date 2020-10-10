package ru.otus.architect.parser.concrete;

import ru.otus.architect.parser.IParser;
import ru.otus.architect.parser.Parser;

public class CsvParser extends Parser {

    public CsvParser() {
    }

    public CsvParser(IParser parser){
        this.setNextParser(parser);
    }

    @Override
    public void parseFile(String fileName) {
        if (canHandleFile(fileName, ".csv")){
            System.out.println("Обработчик CSV получил файл: " + fileName);
        }
        else{
            super.parseFile(fileName);
        }
    }

}