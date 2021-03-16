
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class bai25 {
    
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, gcd;
        System.out.println("Nhap 2 so :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("USCLN: "+USCLN(num1, num2));
        System.out.println("BSCNN: "+ BSCNN(num1, num2));
    }
}
