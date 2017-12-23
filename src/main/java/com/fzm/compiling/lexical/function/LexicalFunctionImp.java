package com.fzm.compiling.lexical.function;

import com.fzm.compiling.lexical.token.Token;

import java.io.*;
import java.net.URL;

/**
 * @author fzm
 * @date 2017/12/18
 **/
public class LexicalFunctionImp implements LexicalFunction{

    public static int lineNo;

    public static StringBuffer tokenBuffer;

    public static String line;

    private InputStream inputStream;

    @Override
    public boolean initScanner(String fileName) throws FileNotFoundException {
        URL url = LexicalFunctionImp.class.getClassLoader().getResource(fileName);
        File file;
        if (url != null) {
            file = new File(url.getFile());
            inputStream = new FileInputStream(file);
            lineNo = 1;
            return file.exists();
        }
        return false;
    }

    @Override
    public void closeScanner() throws IOException {
        inputStream.close();
        lineNo = 0;
    }

    @Override
    public Token getToken() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        line = reader.readLine();
        return null;
    }

    @Override
    public char getChar() {
        return 0;
    }

    @Override
    public void backChar(char c) {

    }

    @Override
    public void addCharTokenString(char c) {

    }

    @Override
    public void emptyTokenBuffer() {

    }

    @Override
    public Token judgeKeyToken(String idString) {
        return null;
    }
}
