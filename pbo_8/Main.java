package pbo_8;
import java.util.Scanner;
/**
 *
 * @author Raka IF
 */
public class Main {
     public static void main(String[] args) {
       Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan nilai sisi 1 : ");
        double side1 = inputan.nextDouble();
        System.out.print("Masukan nilai sisi 2 : ");
        double side2 = inputan.nextDouble();
        System.out.print("Masukan nilai sisi 3 : ");
        double side3 = inputan.nextDouble();
        
        System.out.print("Masukan warna : ");
        String warna = inputan.next();
        System.out.print("Terisi atau tidak (true/false) : ");
        boolean terisi = inputan.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1,side2,side3, warna, terisi);
        

        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.getTerisi());
    }
}
