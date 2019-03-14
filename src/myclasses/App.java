/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String myText = scanner.nextLine();
        while(myText.indexOf("  ") > 0){
            myText=myText.replaceAll("  ", " ");
        }
        String[] myTextWords = myText.split(" ");
        System.out.printf("В этой строке %d слов%n",myTextWords.length);
    }
}
