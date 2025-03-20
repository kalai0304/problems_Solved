// Problem-2
// Problem Description:
// A positive integer d is said to be a factor of another positive integer N if when N is divided by d, the remainder obtained is zero. For example, for number 12, there are 6 factors 1, 2, 3, 4, 6, 12. Every positive integer k has at least two factors, 1 and the number k itself. Given two positive integers N and k, write a program to print the kth largest factor of N.
// Input Format: The input is a comma-separated list of positive integer pairs (N, k).
// Output Format: The kth highest factor of N. If N does not have k factors, the output should be 1.
// Constraints:
// •	1<N<10000000000
// •	1<k<600.
// You can assume that N will have no prime factors which are larger than 13.
// Example 1
// •	Input: 12,3
// •	Output: 4
// Explanation: N is 12, k is 3. The factors of 12 are (1,2,3,4,6,12). The highest factor is 12 and the third largest factor is 4. The output must be 4.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighestFactor {
    public static void findFactor(int N,int K){
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){

                if(N/i == i){
                    list.add(i);
                }
                else{
                    list.add(i);
                    list.add(N/i);
                }
            }
            
        }
        System.out.println(list);
        System.out.println((K<list.size()) ? (K == N-1) ? list.get(N-1): list.get(K+1): 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K =  sc.nextInt();
        findFactor(N, K);
        sc.close();
    }
}
