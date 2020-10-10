package ru.otus.architect.parser.concrete;

import ru.otus.architect.parser.IParser;
import ru.otus.architect.parser.Parser;

public class XmlParser extends Parser {

    public XmlParser() {
    }

    public XmlParser(IParser parser){
        this.setNextParser(parser);
    }

    @Override
    public void parseFile(String fileName) {
        if (canHandleFile(fileName, ".xml")){
            System.out.println("Обработчик XML получил файл: " + fileName);
        }
        else{
            super.parseFile(fileName);
        }
    }

}