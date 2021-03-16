
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
public class bai24 {
    
    public static int chusoDau(int n) {
        int temp;
        do {
            temp = n % 10;
            n /= 10;
        } while (n > 0);
        return temp;
    }
     public static int tongSo(int n) {
        int temp , sum = 0;
        do {
            temp = n % 10;
            n /= 10;
            sum = sum + temp;
        } while (n > 0);
        return sum;
    }
     
    public static int DaoNguoc(int num){
        int soDao = 0;
        while(num != 0) {
            int digit = num % 10;
            soDao = soDao * 10 + digit;
            num /= 10;
        }
        return soDao;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int so = 0; 
        String pasSo = String.valueOf(so);
        
        System.out.println("Nhap so: ");
        so = sc.nextInt();
        System.out.println("So "+so+ " co " +pasSo.length());
        System.out.println("so cuoi :"+so%10);
        System.out.println("So dau :"+chusoDau(so));
        System.out.println("Tong cua so: "+tongSo(so));
        System.out.println("So dao nguoc: "+DaoNguoc(so));
        
    }
}
