/*
 
 */
package com.mycompany.baitap;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        String u,p,a,b;
        u="HuyHoang";
        p="2021";
        System.out.println("Nhap username: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println("Nhap password: ");
        b = sc.nextLine();
        if ((a.equals(u)) && (b.equals(p))) {
            System.out.println("Nhap dung (" + u + ", " + p + ")");
        }
        else {
            System.out.println("Nhap sai username hoac password");
        }  
    }
}
