/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmentomilia1;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author creoo
 */
public class InterpretationsTest {
    

    /**
     * Test of findInterpretations method, of class Interpretations.
     */
    @Test
    public void testFindInterpretations() {
      System.out.println("findInterpretations");
//       String[] numbersSetsArray = {"698","525"};
//       String[] original = numbersSetsArray.clone();
//       int expResult = 16;
//       
//        int result=Interpretations.findInterpretations(numbersSetsArray, original).size();
//       assertEquals(expResult, result);
//        //
//        
//       String[] numbersSetsArray1 = {"690"};
//       String[] original1 = numbersSetsArray1.clone();
//       HashSet<String>  result1= Interpretations.findInterpretations(numbersSetsArray1, original1);
//        
//        HashSet<String> expResult1=new HashSet<String>();
//       expResult1.add("60090");
//       expResult1.add("690");
//        System.out.println(result1);
//       assertEquals(expResult1, result1);
//        //
//     String[] numbersSetsArray2 = {"600","5"};
//        String[] original2 = numbersSetsArray2.clone();
//       HashSet<String> result2 = Interpretations.findInterpretations(numbersSetsArray2, original2);
//       
//        HashSet<String> expResult2=new HashSet<String>();
//       expResult2.add("6005");
//       expResult2.add("605");
//       System.out.println(result2);
//        assertEquals(expResult2, result2);  
//        //
//        String[] numbersSetsArray3 = {"40","5"};
//        String[] original3 = numbersSetsArray3.clone();
//        HashSet<String> result3 = Interpretations.findInterpretations(numbersSetsArray3, original3);
//        
//        HashSet<String> expResult3=new HashSet<String>();
//        expResult3.add("405");
//        expResult3.add("45");
//        System.out.println(result3);
//        assertEquals(expResult3, result3);  
//        //
//        
//        String[] numbersSetsArray4 = {"100","5"};
//        String[] original4 = numbersSetsArray4.clone();
//        HashSet<String> result4 = Interpretations.findInterpretations(numbersSetsArray4, original4);
//        
//        HashSet<String> expResult4=new HashSet<String>();
//        expResult4.add("105");
//        expResult4.add("1005");
//        System.out.println(result4);
//        assertEquals(expResult4, result4);
        //
//        String[] numbersSetsArray5 = {"45"};
//        String[] original5 = numbersSetsArray5.clone();
//        HashSet<String> result5 = Interpretations.findInterpretations(numbersSetsArray5, original5);
//        
//        HashSet<String> expResult5=new HashSet<String>();
//        expResult5.add("405");
//        expResult5.add("45");
//        System.out.println(result5);
//        assertEquals(expResult5, result5);
        //
//        String[] numbersSetsArray6 = {"400","98"};
//        String[] original6 = numbersSetsArray6.clone();
//        HashSet<String> result6 = Interpretations.findInterpretations(numbersSetsArray6, original6);
//        
//        HashSet<String> expResult6=new HashSet<String>();
//        expResult6.add("40098");
//        expResult6.add("400908");
//        expResult6.add("4908");
//        expResult6.add("498");
//        
//        System.out.println(result6);
//        assertEquals(expResult6, result6);
                //
//          String[] numbersSetsArray7 = {"510","11"};
//        String[] original7 = numbersSetsArray7.clone();
//        HashSet<String> result7 = Interpretations.findInterpretations(numbersSetsArray7, original7);
//        
//        HashSet<String> expResult7=new HashSet<String>();
//        expResult7.add("51011");
//        expResult7.add("5001011");
//        
//        System.out.println(result7);
//        assertEquals(expResult7, result7);
            //
         String[] numbersSetsArray8 = {"600","0","60","0","0"};
        String[] original8 = numbersSetsArray8.clone();
        HashSet<String> result8 = Interpretations.findInterpretations(numbersSetsArray8, original8);
        
        HashSet<String> expResult8=new HashSet<String>();
        expResult8.add("60006000");
        
        System.out.println(result8);
        assertEquals(expResult8, result8);
    }
    
}
