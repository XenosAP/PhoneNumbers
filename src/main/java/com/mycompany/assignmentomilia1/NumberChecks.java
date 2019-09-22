/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmentomilia1;

/**
 *
 * @author creoo
 */
public class NumberChecks {

    //Checks validity of the number 
    public static String checkNumberLength(String interpretation) {
        if (interpretation.length() == 10) {
            if (interpretation.startsWith("69") || interpretation.startsWith("2")) {
                return "Valid";
            }
        } else if (interpretation.length() == 14) {
            if (interpretation.startsWith("003069") || interpretation.startsWith("00302")) {
                return "Valid";
            }
        } 
            return "Invalid";
        
    }
}
