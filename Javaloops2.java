package Hackerrankeasy;
/* For each query, print the corresponding series on a new line. 
 * Each series must be printed in order as a single line of  space-separated integers.
 * (a+2^0.b),(a+2^0.b+2^1.b).......(a+2^0.b+2^1.b+.......+2^n-1.b).
 */
import java.util.*;
import java.io.*;

class Javaloops2{
    public static void main(String []argh)
    {
        int finalsum;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;j++)
            {
            int sum=0;
            for(int k=1;k<=j;k++)
            { 
               int power = (int) Math.pow(2,k-1)*b;
               sum = sum + power;
            }
                finalsum = a+sum;
                System.out.print(finalsum+" ");     
            }
         System.out.println();
        }
        in.close();
    }
}