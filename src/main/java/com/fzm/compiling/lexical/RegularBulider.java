package com.fzm.compiling.lexical;

import com.fzm.compiling.lexical.token.Token;
import com.fzm.compiling.lexical.token.TokenType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fzm
 * @date 2017/12/17
 **/
public class RegularBulider {

    private static String letter;

    private static String digit;

    /**
     * 用于过滤程序中的空白和注释
     */
    public static final String COMMENT = "//|--";

    public static final String WHITE_SPACE = "( |\\t|\\n)+";

    public static final String ID = "[a-zA-Z]+([a-zA-Z]|[0-9])*";

    public static List<Token> tokenList;
    public static void bulid(){
        RegularBulider.letter = "[a-zA-Z]";
        RegularBulider.digit = "[0-9]";

        TokenType.SEMICO.setContains(";");
        TokenType.L_BRACKET.setContains("(");
        TokenType.R_BRACKET.setContains(")");
        TokenType.COMMA.setContains(";");
        TokenType.PLUS.setContains("+");
        TokenType.MINUS.setContains("-");
        TokenType.MUL.setContains("*");
        TokenType.DIV.setContains("/");
        TokenType.POWER.setContains("**");
        TokenType.CONST_ID.setContains("[0-9]+(.[0-9]*)+");
    }

    public static void buildTokenList(){
        tokenList = new ArrayList<>();
        tokenList.add(new Token(TokenType.CONST_ID,"PI",3.1415926,null));
        tokenList.add(new Token(TokenType.CONST_ID,"E",2.71828,null));
        tokenList.add(new Token(TokenType.T,"T",0.0,null));
        tokenList.add(new Token(TokenType.FUNC,"SIN",0.0,"sin"));
        tokenList.add(new Token(TokenType.FUNC,"COS",0.0,"cos"));
        tokenList.add(new Token(TokenType.FUNC,"TAN",0.0,"tan"));
        tokenList.add(new Token(TokenType.FUNC,"LN",0.0,"log"));
        tokenList.add(new Token(TokenType.FUNC,"EXP",0.0,"exp"));
        tokenList.add(new Token(TokenType.FUNC,"SQRT",0.0,"sqrt"));
        tokenList.add(new Token(TokenType.ORIGIN,"ORIGIN",0.0,null));
        tokenList.add(new Token(TokenType.SCALE,"SCALE",0.0,null));
        tokenList.add(new Token(TokenType.ROT,"ROT",0.0,null));
        tokenList.add(new Token(TokenType.IS,"IS",0.0,null));
        tokenList.add(new Token(TokenType.FOR,"FOR",0.0,null));
        tokenList.add(new Token(TokenType.FROM,"FROM",0.0,null));
        tokenList.add(new Token(TokenType.TO,"TO",0.0,null));
        tokenList.add(new Token(TokenType.STEP,"STEP",0.0,null));
        tokenList.add(new Token(TokenType.DRAW,"DRAW",0.0,null));
    }
}
