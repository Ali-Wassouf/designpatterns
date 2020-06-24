package com.wassouf.ali.commandpattern.classes.client;

import com.wassouf.ali.commandpattern.classes.command.OpenTextFileOperation;
import com.wassouf.ali.commandpattern.classes.command.SaveTextFileOperation;
import com.wassouf.ali.commandpattern.classes.invoker.TextFileOperationExecutor;
import com.wassouf.ali.commandpattern.classes.receiver.TextFile;

public class Main
{
    public static void main(String[] args)
    {
        TextFileOperationExecutor textFileOperationExecutor
            = new TextFileOperationExecutor();
        var textFile = new TextFile("file1.txt");
        //another way to do this would be the following
        /* System.out.println(textFileOperationExecutor.executeOperation(() -> "something"));*/
        /* System.out.println(textFileOperationExecutor.executeOperation(textFile::open));*/
        System.out.println(textFileOperationExecutor.executeOperation(
            new OpenTextFileOperation(textFile)));
        System.out.println(textFileOperationExecutor.executeOperation(
            new SaveTextFileOperation(textFile)));
    }
}
