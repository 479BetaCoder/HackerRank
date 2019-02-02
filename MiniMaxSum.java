/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        int smallestIndex = 0;
        int largestIndex = 0;
        long smallestNum = arr[0], largestNum = arr[0];
        long minValue = 0,maxValue = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallestNum)
            {
                smallestIndex = i;
                smallestNum = arr[i];
            }
            if(arr[i]>largestNum)
            {
                largestIndex = i;
                largestNum = arr[i];
            }
            
           
        }
        for(int k=0;k<arr.length;k++)
        {
            if(k!=smallestIndex)
            {
                maxValue = maxValue + arr[k];
            }
            if(k!=largestIndex)
            {
                minValue = minValue + arr[k];
            }
        }
        System.out.print( minValue );
        System.out.print(" ");
        System.out.print(maxValue );
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
