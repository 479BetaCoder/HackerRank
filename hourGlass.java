/* Print the hour glass sum of an array*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int rowsCovered = 0;
        int colCovered = 0;
        int maxHourSum = -60;
        int hourSum=0;
        int skipCounter = 1;
        
        while(rowsCovered<4){
            colCovered = 0;
            while(colCovered < 4)
            {
            skipCounter = 1;
            hourSum = 0;
            for(int row=rowsCovered; row<rowsCovered+3;row++)
            {
                for(int col=colCovered;col<colCovered+3;col++)
                {
                    if(skipCounter!=4 && skipCounter!=6){
                    hourSum+= arr[row][col];
                    }
                    skipCounter++;
                }
            }
            colCovered++;
            if(maxHourSum<hourSum){
                maxHourSum = hourSum;
            }
            }
            

            rowsCovered++;
        }
        System.out.println(maxHourSum);
        scanner.close();
    }
}
