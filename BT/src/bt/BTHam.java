
package bt;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class BTHam {
    //Bai 1
    public static void Java2021() {
        System.out.println("Lập trình Java 2021");
    }
    //Bai 2
    public static void PString(String a) {
        System.out.println(a);
    }
    //Bai 4
    public static void PTB1(double a,double b) {
        double x;
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
    //Bai 5
    public static void PTB2(double a,double b,double c) {
        double x,d;
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
    public static void main(String[] args) {
        //Bai 1
        Java2021();
        //Bai 2
        PString("abc");
        //Bai 3
        Scanner s = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = s.nextInt();
        for (int i = 0;i<=n;i++) {
            PString(s.nextLine());
        }
        //Bai 6+7
        int chon;
        double a,b,c;
        do {
            System.out.println("Nhap so 1 de giai phuong trinh bac 1: ");
            System.out.println("Nhap so 2 de giai phuong trinh bac 2: ");
            System.out.println("Nhap so 0 de ket thuc chuong trinh");
            chon= s.nextInt();
            //Bai 4
            if (chon==1) {
                System.out.println("Nhap hai so a va b: ");
                a= s.nextDouble();
                b= s.nextDouble();
                PTB1(a,b);
            }
            //Bai 5
            if (chon==2) {
                System.out.println("Nhap ba so a, b, c: ");
                a= s.nextDouble();
                b= s.nextDouble();
                c= s.nextDouble();
                PTB2(a,b,c);
            }
        } while ((chon==1) || (chon==2));
    }
}
