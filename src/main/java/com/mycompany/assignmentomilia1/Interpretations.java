/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignmentomilia1;

import java.util.HashSet;

/**
 *
 * @author creoo
 */
public class Interpretations {

    private static int count = 0;
    private static HashSet<String> interpretations = new HashSet<>();

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Interpretations.count = count;
    }

    public static HashSet<String> getInterpretations() {
        return interpretations;
    }

    public static void setInterpretations(HashSet<String> interpretations) {
        Interpretations.interpretations = interpretations;
    }

    public static HashSet<String> findInterpretations(String[] numbersSetsArray, String[] original) {
        String interpretation1 = String.join("", numbersSetsArray);
        interpretations.add(interpretation1.replaceAll("\\s", ""));

        //Inserts first interpretation, just removing white spaces
        try {
            for (int i = 0; i < numbersSetsArray.length; i++) {
                if (numbersSetsArray[i].length() == 3) {
                    if (numbersSetsArray[i].endsWith("00")) {//600 92
                        if (numbersSetsArray[i + 1].length() == 2) {
                            String tempVal = numbersSetsArray[i];//save the original value
                            numbersSetsArray[i] = original[i].substring(0, 1);
                            String interpretation = String.join("", numbersSetsArray);
                            interpretations.add(interpretation.replaceAll("\\s", ""));
                            numbersSetsArray[i] = original[i].substring(0, 1) + "     ";
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
                        } else if (numbersSetsArray[i + 1].length() == 1 && !"0".equals(numbersSetsArray[i + 1])) {//600 2
                            String tempVal = numbersSetsArray[i];
                            numbersSetsArray[i] = original[i].substring(0, 2);
                            String interpretation = String.join("", numbersSetsArray);
                            interpretations.add(interpretation.replaceAll("\\s", ""));
                            numbersSetsArray[i] = original[i].substring(0, 2) + "  ";
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
                        }
                    } else if (numbersSetsArray[i].endsWith("0")) {//690
                        String tempVal = numbersSetsArray[i];
                        numbersSetsArray[i] = original[i].substring(0, 1) + "00" + original[i].substring(1);
                        String interpretation = String.join("", numbersSetsArray);
                        interpretations.add(interpretation.replaceAll("\\s", ""));
                        findInterpretations(numbersSetsArray, original);
                        numbersSetsArray[i] = tempVal;
                        if (numbersSetsArray[i + 1].length() == 1 && !"0".equals(numbersSetsArray[i + 1])) {

                            numbersSetsArray[i] = original[i].substring(0, 2);
                            String interpretationn = String.join("", numbersSetsArray);
                            interpretations.add(interpretationn.replaceAll("\\s", ""));
                            numbersSetsArray[i] = original[i].substring(0, 2) + "  ";
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
                        }
                    } else {
                        if ("0".equals(numbersSetsArray[i].substring(1, 2))) {//609
                            String tempVal = numbersSetsArray[i];
                            numbersSetsArray[i] = original[i].substring(0, 1) + "00" + original[i].substring(2);
                            String interpretation = String.join("", numbersSetsArray);
                            interpretations.add(interpretation.replaceAll("\\s", ""));
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
//                        
                        } else {//698
                            String tempVal = numbersSetsArray[i];
                            numbersSetsArray[i] = original[i].substring(0, 1) + "00" + original[i].substring(1, 2) + "0" + original[i].substring(2);
                            String interpretation = String.join("", numbersSetsArray);
                            interpretations.add(interpretation.replaceAll("\\s", ""));
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = original[i].substring(0, 1) + "00" + original[i].substring(1, 2) + original[i].substring(2);
                            String interpretation2 = String.join("", numbersSetsArray);
                            interpretations.add(interpretation2.replaceAll("\\s", ""));
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = original[i].substring(0, 1) + original[i].substring(1, 2) + "0" + original[i].substring(2);
                            String interpretation3 = String.join("", numbersSetsArray);
                            interpretations.add(interpretation3.replaceAll("\\s", ""));
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
                        }
                    }
                }//3 digits
                else if (numbersSetsArray[i].length() == 2) {
                    if (numbersSetsArray[i].endsWith("0")) {
                        if ((numbersSetsArray[i + 1].length() == 1) && !"0".equals(numbersSetsArray[i + 1])) {
                            String tempVal = numbersSetsArray[i];
                            numbersSetsArray[i] = original[i].substring(0, 1);
                            String interpretation = String.join("", numbersSetsArray);
                            interpretations.add(interpretation.replaceAll("\\s", ""));
                            numbersSetsArray[i] = original[i].substring(0, 2) + "   ";
                            findInterpretations(numbersSetsArray, original);
                            numbersSetsArray[i] = tempVal;
                        }

                    } else if ("11".equals(numbersSetsArray[i]) || "12".equals(numbersSetsArray[i])) {
                        //needs to be differentiated due to greek pronunciation

                    } else {//15

                        String tempVal = numbersSetsArray[i];
                        numbersSetsArray[i] = original[i].substring(0, 1) + "0" + original[i].substring(1);
                        String interpretation = String.join("", numbersSetsArray);
                        interpretations.add(interpretation.replaceAll("\\s", ""));
                        numbersSetsArray[i] = original[i].substring(0, 1) + "0" + original[i].substring(1) + " ";//fixes entering wrong loop
                        findInterpretations(numbersSetsArray, original);
                        numbersSetsArray[i] = tempVal;
                    }
                }//2 digits
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return interpretations;
    }

}
