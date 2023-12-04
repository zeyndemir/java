/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string2;

/**
 *
 * @author Zeynep DEMİR
 */
public class String2 {

    /**
     * @param args the command line arguments
     * 
     * // BOŞLUK DÜNYADAN SONRASINI KOPARIP STR'Yİ YENİ HALİYLE "DUNYA MERHABA" HALİNE GETİRİNİZ. 
     */
    public static void main(String[] args) {
        
        String str= "Zeynep DEMİR";/* buraya hangi kelimeyi girersek girelim çalışır. Çünkü 
         boşluk değerini ki neredeyse gireceğimiz her cümle ya da tamlamada nulunur 
        anaktar olarak girdiğimizden her boşluk sonrasını ters çevirir*/
        int sayi; 
        sayi= str.indexOf(" ");  //str stringinin içerisineki boşluğun indeksini verdiği için int veri tipindedir.
        System.out.println("sayi= "+sayi);
        String s1,s2;
        s1= str.substring(0,sayi);
        s2= str.substring(sayi+1);// boşluğa sayi demiştik. ancak boşluktan başlamayacağız. Dünya kelimesinin D harfinden başlayacağız.
        str = s2+" "+s1;
        System.out.println("tersi= "+ str);
        
        /*Birden fazla boşluk varsa indexof()ilk boşluğu indeks olarak alır. Örneğin: ALİ TAŞ KAFA => TAş KAFA ALİ*/
        
        str= str.toUpperCase();
        System.out.println("str buyuk harf= "+ str);
        str= str.toLowerCase();
         System.out.println("str kucuk harf= "+ str);
       
    }
    
}
