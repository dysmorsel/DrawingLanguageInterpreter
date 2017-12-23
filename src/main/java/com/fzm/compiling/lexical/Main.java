package com.fzm.compiling.lexical;

import com.fzm.compiling.lexical.function.LexicalFunction;
import com.fzm.compiling.lexical.function.LexicalFunctionImp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author School-PC
 */
public class Main {

    public static void main(String[] args) {
        LexicalFunction lexicalFunction = new LexicalFunctionImp();

        System.out.println(lexicalFunction.initScanner("test.txt"));
    }
}
