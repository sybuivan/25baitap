
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
public class bai22 {
    
    public static void main(String[] args) {
        int so, sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap So:");
        so = sc.nextInt();
        System.out.println("Cac uoc so: ");
        for(int i = 1; i<=so; i++){
            if(so%i==0){
                System.out.println(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("Tong cac uoc : " + sum);
        
    }
}
