/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmentomilia1;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author creoo
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our application!" + "\n" + "Give us your phone number please.");
        String input = scanner.nextLine();
        String[] numbersSetsArray = input.trim().split("\\s+");//Removes leading and trailing white spaces and divides the numbers to "sets"
        String[]original=numbersSetsArray.clone();//original cloned array not to be changed
        HashSet<String> interpretations = Interpretations.findInterpretations(numbersSetsArray,original);
        for (String interpretation : interpretations) {
            Interpretations.setCount(Interpretations.getCount()+1);
            System.out.println("Interpretation "+Interpretations.getCount()+": "+interpretation+" [phone number: "+NumberChecks.checkNumberLength(interpretation)+"]");
        }
    }
}
