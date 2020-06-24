package com.wassouf.ali.commandpattern.classes.invoker;

import com.wassouf.ali.commandpattern.classes.command.TextFileOperation;
import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor
{
    private final List<TextFileOperation> textFileOperations
        = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

    public String showOperationsHistory(){
        var stringBuilder = new StringBuilder();
        for(TextFileOperation operation: textFileOperations){
            stringBuilder.append(operation.toString()).append(" ");
        }
        return stringBuilder.toString();
    }
}
