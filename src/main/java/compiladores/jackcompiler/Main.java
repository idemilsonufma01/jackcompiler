/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package compiladores.jackcompiler;

import static compiladores.jackcompiler.TokenType.*;
import compiladores.jackcompiler.Token;
import compiladores.jackcompiler.Scanner;

/**
 *
 * 
 */
public class Main{

    public static void main(String[] args) {
        
        String input = "45 + do - \"ola\" laranja 876";
        Scanner sc = new Scanner(input.getBytes());
        for (Token tk = sc.nextToken(); tk.type != EOF; tk = sc.nextToken()) {
            System.out.println(tk);
        }
    }   
}
