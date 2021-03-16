
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
public class bai23 {
    
    public static void main(String[] args) {
        
    bai23 dt = new bai23();
        
    Scanner sc = new Scanner(System.in);
         
    int so;
    int i, j, sum;
        System.out.println("Nhap so");
        so = sc.nextInt();
    for(i = 2; i <= so; i++)
    {
        sum = 1;
        for(j = 2; j <= i/2; j++)
        {
            if(i%j == 0)
                sum += j;
        }
        if(sum == i)
            System.out.println(i +" ");
    }
}
}
