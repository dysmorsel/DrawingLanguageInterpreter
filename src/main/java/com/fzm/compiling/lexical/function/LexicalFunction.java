package com.fzm.compiling.lexical.function;

import com.fzm.compiling.lexical.token.Token;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author fzm
 * @date 2017/12/18
 **/
public interface LexicalFunction {
    /**
     * 检查函数绘图语言的源程序是否存在，如果存在，则打开该文件，并初始化LineNo为1
     * @param fileName 要分析的源程序文件名
     * @return 文件是否存在
     */
    boolean initScanner(final String fileName) throws FileNotFoundException;

    /**
     * 关闭源程序
     */
    void closeScanner() throws IOException;

    /**
     * 获得一个记号
     * @return 一个记号
     */
    Token getToken() throws IOException;

    /**
     * 从源程序中读取一个字符
     * @return 源程序的一个字符
     */
    char getChar();

    /**
     * 回退多读进的字符
     * @param c 回退的一个字符
     */
    void backChar(char c);

    /**
     * 将已识别的字符添加到TokenBuffer中
     * @param c 源程序的一个字符
     */
    void addCharTokenString(char c);

    /**
     * 清空TokenBuffer
     */
    void emptyTokenBuffer();

    /**
     * 根据识别出的字符串在符号表中查找相应的记号
     * @param idString 识别的记号
     * @return 记号
     */
    Token judgeKeyToken(final String idString);
}
