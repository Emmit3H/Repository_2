/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countword;

import java.util.Scanner;
public class CountWord {

    private static String phrase, fixedPhrase;
    private static int spaces = 0;
    private static Scanner input = new Scanner(System.in);
    
    public static void fixThePhrase(){    
        fixedPhrase = phrase.replaceAll("\\.", "");
    }
    
    public static void countTheWords(){
        char count;
        for(int c=0;c< phrase.length();c++){
            count = fixedPhrase.charAt(c);
            if(Character.isSpaceChar(count)){
                spaces++;
            }
        }
        spaces++;
        System.out.println("There are "+spaces+" words in this phrase");
    }    
        
    public static void main(String[] args) {
        System.out.println("Enter a phrase");
        phrase = input.nextLine();
        fixThePhrase();
        countTheWords();
    }
    
}
