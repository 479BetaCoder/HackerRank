/*You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        //int ab[] = new int[a.length + b.length];
        int smallest = b[0];
        int largest = a[0];
        int output =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest = a[i];
            }
        }
        for(int j=0;j<b.length;j++)
        {
            if(b[j]<smallest)
            {
                smallest = b[j];
            }
        }
        int counter =0;
        System.out.println(largest + " " + smallest);
        for(int num=largest;num<=smallest;num++)
        {
            counter = 0;
            for(int i=0;i<a.length;i++)
            {
                if(num%a[i]==0)
                {
                    counter++;
                }
            }
            if(counter == a.length)
            {   
                counter = 0;
                for(int i=0;i<b.length;i++)
                {
                    if(b[i]%num==0)
                    {
                        counter++;
                    }
                }
                if(counter == b.length)
                {   
                    output++;
                    
                }
            }
            
        }
        return output;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
