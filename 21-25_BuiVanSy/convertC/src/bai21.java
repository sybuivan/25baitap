
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
public class bai21 {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float d1, d2, d3, diemchuan;
        int dt;
        String khuvuc;
        System.out.println("Nhap khu vuc:(A,B,C,X): ");
        khuvuc = sc.nextLine();
        
        System.out.println("Nhap diem chuan: ");
        diemchuan = sc.nextFloat();
        
        System.out.println("Nhap diem mon 1: ");
        d1 = sc.nextFloat();
        
        System.out.println("Nhap diem mon 2: ");
        d2 = sc.nextFloat();
        
        System.out.println("Nhap diem mon 3: ");
        d3 = sc.nextFloat();
        
        System.out.println("Nhap doi tuong:");
        dt = sc.nextInt();
        
        
        if(d1 == 0 || d2 == 0 || d3 == 0)
            System.out.println("Da rot");
        else{
            float tong = d1 + d2 + d3;
            
            switch(khuvuc){
                case "A" :
                    tong += 2; break;
                case "B" :
                    tong +=1; break;
                case "C":
                    tong +=0.5; break;
            }
            switch(dt){
                case 1:
                    tong +=2.5; break;
                case 2:
                    tong += 1.5; break;
                case 3:
                    tong +=1;
            }
            if(tong >= diemchuan)
                System.out.println("Tong "+tong+" DA DAU");
            else
                System.out.println("Rot");
        }
        
        
        
        
    }
}
