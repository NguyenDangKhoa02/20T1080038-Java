package t1080038.baitap29_9_2021;

import java.util.Scanner;
/**

 */
public class bai1 {
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("Number is positive");
        }
        else if(n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is neither Positive nor Negative ");
        }
    }
}
