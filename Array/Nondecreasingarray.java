package Array;

import java.util.*;

import java.io.*;

class Nondecreasingarray {

    public static void main(String args[]) throws Exception {

        /*
         * Sample code to perform I/O:
         * 
         * Use either of these methods for input
         * 
         * 
         * 
         * 
         * //BufferedReader
         * 
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * 
         * String name = br.readLine(); // Reading input from STDIN
         * 
         * System.out.println("Hi, " + name + "."); // Writing output to STDOUT
         * 
         * 
         * 
         * 
         * //Scanner
         * 
         */

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t != 0)

        {

            StringBuilder sb = new StringBuilder();

            int n = s.nextInt();

            long arr[] = new long[n];

            long res[] = new long[n];

            arr[0] = s.nextInt();

            res[0] = arr[0];

            sb.append(arr[0]);

            for (int i = 1; i < n; i++)

            {

                arr[i] = s.nextInt();

                if (arr[i] >= res[i - 1])

                    res[i] = arr[i];

                else

                {

                    long value = ((res[i - 1] + arr[i] - 1) / arr[i]) * arr[i];

                    res[i] = value;

                }

                sb.append(" " + res[i]);

            }

            System.out.println(sb.toString());

            t--;

        }

        s.close();

        // Writing output to STDOUT

        // Write your code here

    }

}