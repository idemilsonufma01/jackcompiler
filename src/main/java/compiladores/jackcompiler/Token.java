/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladores.jackcompiler;

/**
 *
 * @author RAIMUNDA
 */
public class Token {

        public final TokenType type;
        public final String lexeme;

        public Token (TokenType type, String lexeme) {
            this.type = type;
            this.lexeme = lexeme;
        }

        public String toString() {
            var type = this.type.toString();
            
            if (type.equals("NUMBER"))
                type =  "intConst";

            if (type.equals("STRING"))
                type =  "stringConst";

            if (type.equals("IDENT"))
                type =  "identifier";

            if (TokenType.isSymbol(lexeme.charAt(0)))
                type = "symbol";

            if (TokenType.isKeyword(this.type) )
                type = "keyword";
        

            return "<"+ type +">" + lexeme + "</"+ type + ">";
        }
    
}

