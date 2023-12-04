/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string1;

/**
 *
 * @author zeyne
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String str = "konnichiwa ";
        int number;
       String ss;
                       
        number=str.length(); // bize integer bir sonuç verir. 
        
        ss =str.substring(0,5);/*substring ilk yazılan indeks dahil ancak virgülden sonra yazılna dahil olmamak üzere ör
        örneğin burada alınan string indeksleri; konni: k=0, o= 1, n=1, n=3, i=4 (5. indeks yazılmamıştır görüldüğü üzere)
      
        */
        str = str.replace("a", "9");// replacement stringte bir karaşterin değiştirilmesini sağlar
        
        System.out.println("str="+ str);
        System.out.println("number = "+ number);
        System.out.println("ss:" + ss);
        // bu program errror vermedi number değişkenini bir tring olarak algıladı.
        
    }
    
}
