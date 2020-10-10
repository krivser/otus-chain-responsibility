package ru.otus.architect.parser;

public interface IParser {
    IParser setNextParser(IParser parser);
    void parseFile(String fileName);
}
