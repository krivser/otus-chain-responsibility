package ru.otus.architect.parser;

public abstract class Parser implements IParser {
    private IParser parser;

    @Override
    public IParser setNextParser(IParser _parser) {
        this.parser = _parser;
        return this.parser;
    }

    @Override
    public void parseFile(String fileName){
        if (parser != null){
            parser.parseFile(fileName);
        } else {
            System.out.println("Не найден обработчик для файла: " + fileName);
        }
    }

    protected boolean canHandleFile(String fileName, String format){
        return (fileName != null) && (fileName.toLowerCase().endsWith(format));
    }
}