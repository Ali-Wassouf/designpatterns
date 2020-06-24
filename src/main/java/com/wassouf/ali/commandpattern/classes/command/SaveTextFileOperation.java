package com.wassouf.ali.commandpattern.classes.command;

import com.wassouf.ali.commandpattern.classes.receiver.TextFile;

//command
public class SaveTextFileOperation implements TextFileOperation
{
    private final TextFile textFile;


    public SaveTextFileOperation(TextFile textFile)
    {
        this.textFile = textFile;
    }


    @Override
    public String execute()
    {
       return textFile.save();
    }


    @Override
    public String toString()
    {
        return "SaveTextFileOperation";
    }
}
