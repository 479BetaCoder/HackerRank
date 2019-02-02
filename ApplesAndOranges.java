/*Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, 
the red region denotes his house, where  is the start point, and  is the endpoint. The apple tree is to the left of his 
house, and the orange tree is to its right. 
You can assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesInRange = 0, OraInRange = 0;
        for(int i=0;i<apples.length;i++)
        {
            if(a+apples[i]>=s && a+apples[i]<=t)
            {
                applesInRange++;
            }
        }
        for(int j=0;j<oranges.length;j++)
        {
            if(b+oranges[j]>=s && b+oranges[j]<=t)
            {
                OraInRange++;
            }
        }
        System.out.println(applesInRange);
        System.out.println(OraInRange);
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
