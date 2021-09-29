
package t1080038.baitap29_9_2021;

import java.util.Scanner;

/**

 */
public class bai2 {
    public static void main(String[] args) 
    {
        int n,n1,n2,n3;
        Scanner s = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        n1 = s.nextInt();
        System.out.println("Input 2nd number: ");
        n2 = s.nextInt();
        System.out.println("Input 3rd number: ");
        n3 = s.nextInt();
        n=n1;
        if(n2 > n)
        {
            n=n2;
        }
        if(n3 > n)
        {
            n=n3;
        }
        System.out.println("The greatest: " + n);
    }
}
