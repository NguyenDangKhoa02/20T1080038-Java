
package t1080038.baitap29_9_2021_phien3;

import java.util.Scanner;

/**

 */
public class bai4 {
   public static void main(String[] args) 
    {
        int i,d = 0,y = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        i = s.nextInt();
        d = i/(24*60);
        y = d/365;
        d = d%365;
        System.out.print(i + " minutes is approximately " + y + " years and " + d + " days");
    } 
}
