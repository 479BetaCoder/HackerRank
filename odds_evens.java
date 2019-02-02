/* Print odd and even characters in a string */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrRowItems = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrRowItems;
            }

        printOutput(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    public static void printOutput(String[] input)
    {
        for(int i=0;i<input.length;i++)
        {
            String word = input[i];
            String evens = "";
            String odds = "";
            for(int j= 0; j < word.length();j++){
            if(j % 2 == 0){
                evens = evens+word.charAt(j);
            }else{
                odds = odds+word.charAt(j);
            }

        }
        System.out.println(evens + " " + odds);
    }
}
}


