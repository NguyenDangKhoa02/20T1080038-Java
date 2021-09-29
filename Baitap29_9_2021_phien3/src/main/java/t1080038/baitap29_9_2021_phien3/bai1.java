
package t1080038.baitap29_9_2021_phien3;

import java.util.Scanner;

/**

 */
public class bai1 {
    public static void main(String[] args) 
    {
        float f,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        f = s.nextInt();
        c = ((f-32)*5)/9;
        System.out.print(f + " degree Fahrenheit is equal to " + c + " in Celsius ");
    }
}
