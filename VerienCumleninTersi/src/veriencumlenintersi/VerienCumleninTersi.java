/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veriencumlenintersi;

/**
 *
 * @author zeyne
 */
public class VerienCumleninTersi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        String str = "merhaba dünya ben algoritma öğreniyorum";

        String[] sentenceArray;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        sentenceArray = new String[count + 1];
        int indexNumber = 0;
        String partString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                partString += str.charAt(i);
            } else {
                sentenceArray[indexNumber++] = partString;
                partString = "";
            }

            if (i == str.length() - 1) {
                sentenceArray[indexNumber++] = partString;
            }
        }

        String reversedSentence = "";
        for (int i = sentenceArray.length - 1; i >= 0; i--) {
            if (i == sentenceArray.length - 1) {
                reversedSentence = sentenceArray[i];
            } else {
                reversedSentence += " " + sentenceArray[i];
            }
        }

        System.out.println("reversedSentence = " + reversedSentence);

    
    }
    
}
