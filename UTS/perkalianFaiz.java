import java.util.Scanner;  
   
public class perkalianFaiz {  
   
 public static void main(String[] args) {  
   
     Scanner input = new Scanner(System.in);
       
     System.out.print("Masukan Angka Pertama : ");
       
     int angka1 = input.nextInt();
       
     System.out.print("Masukan Angka Kedua : ");  
       
     int angka2 = input.nextInt();
       
     int hasilkali = (angka1*angka2);
       
     System.out.println(angka1+" x "+angka2+" = "+hasilkali);
 }  
} 
