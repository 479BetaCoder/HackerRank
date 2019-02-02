/*Function Description

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

a: an array of integers representing Alice's challenge rating
b: an array of integers representing Bob's challenge rating
Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Constraints

Output Format

Return an array of two integers denoting the respective comparison points earned by Alice and Bob.*/


using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the compareTriplets function below.
    static List<int> compareTriplets(List<int> a, List<int> b) {
        var result = new List<int>();
        int aWins = 0;
        int bWins = 0;
        for(int i =0;i<3;i++)
        {
            if(a.ElementAt(i)>b.ElementAt(i))
            {
                aWins=aWins + 1;
            }
            else if(a.ElementAt(i)<b.ElementAt(i))
            {
                 bWins=bWins + 1;
            }
        }
        result.Add(aWins);
        result.Add(bWins);

        return result;

    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();

        List<int> b = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(bTemp => Convert.ToInt32(bTemp)).ToList();

        List<int> result = compareTriplets(a, b);

        textWriter.WriteLine(String.Join(" ", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
