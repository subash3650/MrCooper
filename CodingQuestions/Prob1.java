//Sum of the elements
// Given N distinct elements. You have to distribute these elements in two parts such that the sum of elements that each part receives must be greater than K
// Find out the number of ways in which you can distribute the elements so that the mentioned condition holds true. Since the answer can be large, print it in modulo 10pow9 +7
// Function description
// Complete the solve function. This function takes the following 3 parameters and returns the answer
// K Represents the given integer value
// arr. Represents the elements of the array
// N. Represents the size of the array arr
// Input format for custom testing
// Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code
// The first line contains two space-separated integers N and K.
// The second line contains N space-separated integers where theth integer denotes theh element.
// Output format
// Print the number of ways in which you can distribute the elements so that the mentioned condition holds true.


import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static int solve(int N, int K, int[] arr) {
        int totalWays = 0;
        int totalSubsets = 1 << N; // 2^N subsets
        
        for (int mask = 0; mask < totalSubsets; mask++) {
            int sum1 = 0, sum2 = 0;
            
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum1 += arr[i];
                } else {
                    sum2 += arr[i];
                }
            }
            
            if (sum1 > K && sum2 > K) {
                totalWays = (totalWays + 1) % MOD;
            }
        }
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(solve(N, K, arr));
        sc.close();
    }
}
