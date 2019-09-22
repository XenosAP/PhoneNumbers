/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmentomilia1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author creoo
 */
public class NumberChecksTest {
    
    @Test
    public void testCheckNumberLength() {
        System.out.println("checkNumberLength");
        String interpretation1 = "6981066283";
        String expResult1 = "Valid";
        String result1 = NumberChecks.checkNumberLength(interpretation1);
        assertEquals(expResult1, result1);
        
        
        String interpretation2 = "00306981066283";
        String expResult2 = "Valid";
        String result2 = NumberChecks.checkNumberLength(interpretation2);
        assertEquals(expResult2, result2);
        
        
        String interpretation3 = "00406981066283";
        String expResult3 = "Invalid";
        String result3 = NumberChecks.checkNumberLength(interpretation3);
        assertEquals(expResult3, result3);
        
        
        String interpretation4 = "698106623834";
        String expResult4 = "Invalid";
        String result4 = NumberChecks.checkNumberLength(interpretation4);
        assertEquals(expResult4, result4);
        
        
        String interpretation5 = "2107510492";
        String expResult5 = "Valid";
        String result5 = NumberChecks.checkNumberLength(interpretation5);
        assertEquals(expResult5, result5);
        
        String interpretation6 = "00302107510492";
        String expResult6 = "Valid";
        String result6 = NumberChecks.checkNumberLength(interpretation6);
        assertEquals(expResult6, result6);
        
        
        String interpretation7 = "00402107510492";
        String expResult7 = "Invalid";
        String result7 = NumberChecks.checkNumberLength(interpretation7);
        assertEquals(expResult7, result7);
        
        
        String interpretation8 = "21075104923";
        String expResult8 = "Invalid";
        String result8 = NumberChecks.checkNumberLength(interpretation8);
        assertEquals(expResult8, result8);
        
        String interpretation9 = "0030510492";
        String expResult9 = "Invalid";
        String result9 = NumberChecks.checkNumberLength(interpretation9);
        assertEquals(expResult9, result9);
        
        String interpretation10 = "00303662831234";
        String expResult10 = "Invalid";
        String result10 = NumberChecks.checkNumberLength(interpretation10);
        assertEquals(expResult10, result10);
        
    }
    
}
