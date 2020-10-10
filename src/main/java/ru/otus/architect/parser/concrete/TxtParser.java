package ru.otus.architect.parser.concrete;

import ru.otus.architect.parser.IParser;
import ru.otus.architect.parser.Parser;

public class TxtParser extends Parser {

    public TxtParser() {
    }

    public TxtParser(IParser parser){
        this.setNextParser(parser);
    }

    @Override
    public void parseFile(String fileName) {
        if (canHandleFile(fileName, ".txt")){
            System.out.println("Обработчик TXT получил файл: " + fileName);
        }
        else{
            super.parseFile(fileName);
        }
    }

}