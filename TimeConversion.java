/*Given a time in -12 hour AM/PM format, convert it to military (24-hour) time.*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         
      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         //Converting the input String to Date
         date= df.parse(s);
         //Changing the format of date and storing it in String
         output = outputformat.format(date);
         //Displaying the date
        
      }catch(ParseException pe){
         pe.printStackTrace();
       }
        return output;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
