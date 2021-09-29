
package t1080038.baitap29_9_2021_phien3;

import java.util.Scanner;

/**

 */
public class bai2 {
    public static void main(String[] args) 
    {
        double i,m;
        Scanner s = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        i = s.nextInt();
        m = i * 0.0254;
        System.out.print(i + " inch is " + m + " meters");
    }
}
