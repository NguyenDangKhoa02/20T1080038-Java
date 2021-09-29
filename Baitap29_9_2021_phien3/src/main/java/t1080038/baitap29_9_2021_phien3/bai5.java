
package t1080038.baitap29_9_2021_phien3;

import java.util.Scanner;

/**

 */
public class bai5 {
    public static void main(String[] args) 
    {
        int h,m,s,second;
        float mps,kph,mph,distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        distance = sc.nextInt();
        System.out.println("Input hour: ");
        h = sc.nextInt();
        System.out.println("Input minutes: ");
        m = sc.nextInt();
        System.out.println("Input seconds: ");
        s = sc.nextInt();
        second = h*3600 + m*60 + s;
        mps = distance/second;
        kph = (distance/1000.0f)/(second/3600.0f);
        mph = (kph / 1.609f);
        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);
    } 
}
