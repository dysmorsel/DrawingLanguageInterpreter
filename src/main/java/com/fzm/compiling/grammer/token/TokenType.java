package com.fzm.compiling.grammer.token;

/**
 * @author fzm
 * @date 2017/12/17
 */
public enum TokenType {
    //保留字
    ORIGIN,SCALE,ROT,IS,
    TO,STEP,DRAM,FOR,FROM,
    //参数
    T,
    //分隔符
    SEMICO,L_BRACKET,R_BRACKET,COMMA,
    //运算符
    PLUS,MINUS,MUIL,DIV,POWER,
    //函数
    FUNC,
    //常数
    CONST_ID,
    //空记号
    NONTOKEN,
    //出错记号
    ERRTOKEN
}
