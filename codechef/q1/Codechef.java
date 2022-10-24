/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(minTimes(a,b));
        }
		
	}

    // static String minCab(int a, int b){
        
    //     int min = Math.min(a,b);
    //     if(a == b){
    //         return "ANY";
    //     }else if(min == a){
    //         return "FIRST";
    //     }else{
    //         return "SECOND";
    //     }
    // }

    static int minTimes(int a, int b){
        return Math.abs(a-b);
    }
}
