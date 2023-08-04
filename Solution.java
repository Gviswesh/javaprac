import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'replacements' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int replacements(String s) {
        // Write your code here
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1))
                continue;
            count += 1;
            if (s.charAt(i) < s.charAt(n - i - 1))
                s = s.replace(s.charAt(n - i - 1), s.charAt(i));
            else
                s = s.replace(s.charAt(n - 1), s.charAt(n - i - 1));
        }
        System.out.println(s + " ");
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int i = Result.replacements(s);

        bufferedWriter.write(String.valueOf(i));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
