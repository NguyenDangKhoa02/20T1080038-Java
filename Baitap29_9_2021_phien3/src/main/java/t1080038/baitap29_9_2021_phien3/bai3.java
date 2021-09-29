
package t1080038.baitap29_9_2021_phien3;

import java.util.Scanner;

/**

 */
public class bai3 {
    public static void main(String[] args) 
    {
        int i,a,t = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000: ");
        i = s.nextInt();
        a = i;
        do {
            t = t + a%10;
            a = a/10;
        } while (a!=0);
        System.out.print("The sum of all digits in " + i + " is " + t);
    }
}
