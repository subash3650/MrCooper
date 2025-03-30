// Minimum arrangements
// Given n balls of m different colors. You want to arrange the balls in all the possible arrangements and you also want to minimize the number of arrangements of balls.
// You can convert all the balls of a particular color into another color but you can do this operation only once.
// Calculate the minimum number of arrangements after applying an operation. As the number can be large, print answer mod 10° +7.
// Arrangements A1, A2 A and B, B... B are said to be different if for any i, 1<i<n.AB
// Function description
// Complete the solve function. This function takes the following 3 parameters and returns the answer
// nRepresents the total number of balls
// m Represents the number of different colors
// arr. Represents the array of size m, denoting the number of balls of each color
// Input format for custom testing
// Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code.
// • The first line contains two integers denoting n and m respectively.
// The next line contains an array Arr of m elements, denoting the number of balls of theth color
// Output format
// // Print the number of arrangements modulo 10pow9 +7



import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
    
    // Modular exponentiation
    public static long modExp(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while(exp > 0) {
            if((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
    
    // Precompute factorials and inverse factorials up to maxN
    public static long[] fact, invFact;
    public static double[] logFact;
    public static void precomputeFactorials(int maxN) {
        fact = new long[maxN + 1];
        invFact = new long[maxN + 1];
        logFact = new double[maxN + 1];
        
        fact[0] = 1;
        logFact[0] = 0.0;
        for (int i = 1; i <= maxN; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            logFact[i] = logFact[i-1] + Math.log(i);
        }
        invFact[maxN] = modExp(fact[maxN], MOD - 2, MOD);
        for (int i = maxN; i >= 0; i--) {
            if(i > 0)
                invFact[i-1] = (invFact[i] * i) % MOD;
        }
    }
    
    public static int solution(int n, int m, int[] arr) {
        // n is provided but we also compute total in case
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        // It must be that total equals n.
        n = total;
        
        precomputeFactorials(n);
        
        // Compute original arrangements f0 = n! / (∏ fact[arr[i]])
        long f0 = fact[n];
        for (int x : arr) {
            f0 = (f0 * invFact[x]) % MOD;
        }
        
        // If only one color, no operation can be applied.
        if(m == 1) {
            return (int)f0;
        }
        
        // Now try all ordered pairs (i,j), i != j.
        // For each pair, the new arrangement count would be:
        // new = f0 * (fact[arr[i]] * fact[arr[j]] / fact[arr[i] + arr[j]])
        // We choose the pair that minimizes new,
