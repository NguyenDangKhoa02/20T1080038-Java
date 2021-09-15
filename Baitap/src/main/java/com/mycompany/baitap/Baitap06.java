/*
 Phuong trinh bac 2
 */
package com.mycompany.baitap;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Baitap06 {
    public static void main(String[] args) {
        double a,b,c,x,d;
        System.out.println("Nhap ba so a, b, c: ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                }
                else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else {
                x=-b/a;
                System.out.println("Phuong trinh co mot nghiem x=" + x);
            }
        }
        else {
            d=b*b-4*a*c;
            if (d==0) {
                x=-b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x=" + x);
            }
            else {
                if (d<0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
                else {
                    System.out.println("Phuong trinh co hai nghiem: ");
                    x=(-b+sqrt(d))/(2*a);
                    System.out.println("x1= " + x);
                    x=(-b-sqrt(d))/(2*a);
                    System.out.println("x2= " + x);
                }
            }
        }
    }
}
