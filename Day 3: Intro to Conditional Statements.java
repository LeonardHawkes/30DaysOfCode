import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans = "";

        scanner.close();

            if (N % 2 == 0)
            {
                ans = "Not Weird";
                
                if (N >= 2 && N <= 5)
                {
                    ans = "Not Weird";
                }

                if (N >= 6 && N <= 20)
                {
                    ans = "Weird";

                    if (N > 20)
                    {
                        ans = "Not Weird";
                    }
                }
            }
            else
            {
                ans = ("Weird");
            }

            System.out.println(ans);

    }
}
