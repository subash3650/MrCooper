// Followers

// N people are standing in a row, each initially having money[i] dollars. Also, Bob has a fixed amount K. All those who have the same money as Bob become his followers. You want to increase Bob's followers. You can perform the following task at most once to make the maximum number of people end up with the same money as Bob

// Choose a subarray of people L, R(0 ≤ L≤RN-1) and an integer

// X(-10° < X < 10º). Add the amount X to each person from index L to R. ie

// moneyj money[j] + X. (If X is negative, you are taking money from the person).

// Find the maximum number of followers of Bob after at most one such operation.

// Notes

// Money[i] can become negative. This means the person is in debt.

// Only the final value of money[i] matters. If initially money[i]=K but after the operation it changes, then the th person is not a follower.

// Function description

// Complete the function solution() The function takes 3 parameters and returns the maximum number of followers.

// N. Represents the number of people

// K. Represents Bob's amount

// money] Represents the initial money each person has

// Input format for custom testing

// Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code. The first line contains N, denoting the number of people.

// The second line contains K, denoting Bob's amount.

// The second line contains an integer array money[] denoting the initial money each person has

// Output format

// Return a single integer representing the maximum number of followers.

import java.util.*;

public class Main {
    
    public static int solution(int N, int K, int[] money) {
        Map<Integer, Integer> freq = new HashMap<>();
        int initialFollowers = 0;
        
        // Count initial followers
        for (int val : money) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            if (val == K) {
                initialFollowers++;
            }
        }
        
        int maxFollowers = initialFollowers;
        
        // Try every possible subarray modification
        for (int L = 0; L < N; L++) {
            int sum = 0;
            for (int R = L; R < N; R++) {
                sum += money[R];
                int len = R - L + 1;
                
                if ((K * len - sum) % len == 0) { // Ensure X is an integer
                    int X = (K * len - sum) / len;
                    if (X > -1e9 && X < 1e9) { // Ensure X is within valid range
                        int newFollowers = 0;
                        for (int j = L; j <= R; j++) {
                            if (money[j] + X == K) {
                                newFollowers++;
                            }
                        }
                        maxFollowers = Math.max(maxFollowers, initialFollowers + newFollowers - freq.getOrDefault(K, 0));
                    }
                }
            }
        }
        
        return maxFollowers;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] money = new int[N];
        
        for (int i = 0; i < N; i++) {
            money[i] = sc.nextInt();
        }
        
        System.out.println(solution(N, K, money));
        sc.close();
    }
}