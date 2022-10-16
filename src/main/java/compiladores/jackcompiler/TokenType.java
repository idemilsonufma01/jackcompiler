/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladores.jackcompiler;

import java.util.List;

/**
 *
 * @author RAIMUNDA
 */
public enum TokenType {
        PLUS,
        MINUS,
        EQ,
        AST,
        SLASH,
        AND,
        OR,
        NOT,
        GT,
        LT,
        PONT,
        VIRG,
        PVIRG,
        EPARENT,
        DPARENT,
        ECHAV,
        DCHAV,
        ECOLC,
        DCOLC,

     // Literals.
     NUMBER,
     STRING,


     IDENT,

 
     // keywords
     CLASS,
     CONSTRUCTOR,
     FUNCTION,
     METHOD,
     FIELD,
     STATIC,
     VAR,
     INT,
     CHAR,
     BOOLEAN,
     VOID,
     TRUE,
     FALSE,
     NULL,
     THIS,
     LET,
     DO,
     IF,
     ELSE,
     WHILE,
     RETURN,

     EOF,

     ILLEGAL;
     private TokenType(){

    }
    private TokenType(String value) {
        this.value= value;
    }

    public String value;
     static public boolean isSymbol (char c) {
        String symbols = "{}()[].,;+-*/&|<>=~";
        return symbols.indexOf(c) > -1;
    }

    static public boolean isOperator(TokenType type){
        return "+-/*<>~=&|".contains(type.value);
    }


    static public boolean isKeyword (TokenType type) {
        List<TokenType> keywords  = 
            List.of(
                CLASS,
                CONSTRUCTOR,
                FUNCTION,
                METHOD,
                FIELD,
                STATIC,
                VAR,
                INT,
                CHAR,
                BOOLEAN,
                VOID,
                TRUE,
                FALSE,
                NULL,
                THIS,
                LET,
                DO,
                IF,
                ELSE,
                WHILE,
                RETURN

               
            );
            return keywords.contains(type);
    }

}

