package ru.otus.architect.parser.concrete;

import ru.otus.architect.parser.IParser;
import ru.otus.architect.parser.Parser;

public class JsonParser extends Parser {

    public JsonParser() {
    }

    public JsonParser(IParser parser){
        this.setNextParser(parser);
    }

    @Override
    public void parseFile(String fileName) {
        if (canHandleFile(fileName, ".json")){
            System.out.println("Обработчик JSON получил файл: " + fileName);
        }
        else{
            super.parseFile(fileName);
        }
    }

}