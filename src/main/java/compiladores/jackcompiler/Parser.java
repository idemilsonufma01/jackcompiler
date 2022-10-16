/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladores.jackcompiler;
import compiladores.jackcompiler.Token;
import compiladores.jackcompiler.TokenType;
/**
 *
 * @author RAIMUNDA
 */
public class Parser {
    private Scanner scan;
    private Token currentToken;
    
    public Parser (byte[] input) {
            scan = new Scanner(input);
            currentToken = scan.nextToken();
        
    }

    public void parse () {
        expr();
    }

    void expr() {
        number();
        oper();
    }

    void number () {
        System.out.println(currentToken.lexeme);
        match(TokenType.NUMBER);
    }

    private void nextToken () {
        currentToken = scan.nextToken();
    }

   private void match(TokenType t) {
        if (currentToken.type == t) {
            nextToken();
        }else {
            throw new Error("syntax error");
        }
   }

    void oper () {
        if (currentToken.type == TokenType.PLUS) {
            match(TokenType.PLUS);
            number();
            System.out.println("add");
            oper();
        } else if (currentToken.type == TokenType.MINUS) {
            match(TokenType.MINUS);
            number();
            System.out.println("sub");
            oper();
        }else if(currentToken.type == TokenType.AND){
            match(TokenType.AND);
            number();
            System.out.println("and");
            oper();
        }else if(currentToken.type == TokenType.AST){
            match(TokenType.AST);
            number();
            System.out.println("mult");
            oper();
        }else if(currentToken.type == TokenType.SLASH){
            match(TokenType.SLASH);
            number();
            System.out.println("div");
            oper();

        }else if(currentToken.type == TokenType.OR){
            match(TokenType.OR);
            number();
            System.out.println("or");
            oper();
        }else if(currentToken.type == TokenType.EQ){
            match(TokenType.EQ);
            number();
            System.out.println("eq");
            oper();
        
        }else if(currentToken.type == TokenType.GT){
            match(TokenType.GT);
            number();
            System.out.println("gt");
            oper();

        }else if(currentToken.type == TokenType.LT){
            match(TokenType.LT);
            number();
            System.out.println("lt");
            oper();
        
        }else if(currentToken.type == TokenType.PONT){
            match(TokenType.PONT);
            number();
            System.out.println("pont");
            oper();


        }else if(currentToken.type == TokenType.VIRG){
            match(TokenType.VIRG);
            number();
            System.out.println("virg");
            oper();

        }else if(currentToken.type == TokenType.PVIRG){
            match(TokenType.PVIRG);
            number();
            System.out.println("pvirg");
            oper();
        
        }else if(currentToken.type == TokenType.EPARENT){
            match(TokenType.EPARENT);
            number();
            System.out.println("eparent");
            oper();

        }else if(currentToken.type == TokenType.DPARENT){
            match(TokenType.DPARENT);
            number();
            System.out.println("dparent");
            oper();

        }else if(currentToken.type == TokenType.ECHAV){
            match(TokenType.ECHAV);
            number();
            System.out.println("echav");
            oper();

        }else if(currentToken.type == TokenType.DCHAV){
            match(TokenType.DCHAV);
            number();
            System.out.println("dchav");
            oper();

        }else if(currentToken.type == TokenType.ECOLC){
            match(TokenType.ECOLC);
            number();
            System.out.println("ecolc");
            oper();

        }else if(currentToken.type == TokenType.DCOLC){
            match(TokenType.DCOLC);
            number();
            System.out.println("dcolc");
            oper();
        } else if (currentToken.type == TokenType.EOF) {
            // vazio
        } else {
            throw new Error("syntax error");
        }
    }

    public String VMOutput() {
        return "";
    }
}
