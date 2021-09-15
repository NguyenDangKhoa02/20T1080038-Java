/*
 Phuong trinh bac 1
 */
package com.mycompany.baitap;
import java.util.Scanner;
public class Baitap05 {
    public static void main(String[] args) {
        double a,b,x;
        System.out.println("Nhap hai so a va b: ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextDouble();
        b= sc.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            x=-b/a;
            System.out.println("Phuong trinh co nghiem x=" + x);
        }
    }
}
