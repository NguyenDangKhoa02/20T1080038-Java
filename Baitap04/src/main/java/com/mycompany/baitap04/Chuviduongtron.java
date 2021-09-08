/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitap04;
import java.util.Scanner;
public class Chuviduongtron {
    public static void main(String[] args) {
        double r;
        double c;
        Scanner sc = new Scanner(System.in);
        r= sc.nextDouble();
        c=r*r*3.14159;
        System.out.println("Chu vi duong tron cua " + r + " la " + c);
    }
}
