package com.fzm.compiling.lexical.token;

/**
 * @author fzm
 * @date 2017/12/17
 */
public enum TokenType {
    //保留字
    ORIGIN,SCALE,ROT,IS,
    TO,STEP,DRAW,FOR,FROM,
    //参数
    T,
    //分隔符
    SEMICO,L_BRACKET,R_BRACKET,COMMA,
    //运算符
    PLUS,MINUS,MUL,DIV,POWER,
    //函数
    FUNC,
    //常数
    CONST_ID,
    //空记号
    NONTOKEN,
    //出错记号
    ERRTOKEN;

    private String contains;

    TokenType(String contains){
        this.contains = contains;
    }

    TokenType() {

    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
}
