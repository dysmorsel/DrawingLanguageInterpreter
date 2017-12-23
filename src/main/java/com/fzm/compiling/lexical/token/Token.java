package com.fzm.compiling.lexical.token;

/**
 * @author fzm
 * @date 2017/12/17
 */
public class Token {

    private TokenType tokenType;

    private String lexeme;

    private Double value;

    /**
     * 属性，若记号是函数则返回函数指针
     */
    private String functionName;

    public Token() {
    }

    public Token(TokenType tokenType, String lexeme, Double value, String functionName) {
        this.tokenType = tokenType;
        this.lexeme = lexeme;
        this.value = value;
        this.functionName = functionName;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
