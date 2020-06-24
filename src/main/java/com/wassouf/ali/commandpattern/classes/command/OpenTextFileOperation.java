package com.wassouf.ali.commandpattern.classes.command;

import com.wassouf.ali.commandpattern.classes.receiver.TextFile;

//command
public class OpenTextFileOperation implements TextFileOperation
{
    private final TextFile textFile;


    public OpenTextFileOperation(TextFile textFile)
    {
        this.textFile = textFile;
    }


    @Override
    public String execute()
    {
        return textFile.open();
    }


    @Override
    public String toString()
    {
        return "OpenTextFileOperation";
    }
}
