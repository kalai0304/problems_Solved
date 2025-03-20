// Problem-2

// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.

import java.util.Scanner;

public class CompleteStaricase {
    public static int findCompleteRows(long arr[],int n){
        if(n==0){
            return 0;
        }
        arr[0] = 1;
        int completedRow = 1;
        // int rowCount=0;
        for(int i=1;i<n/2;i++){
            arr[i] = (i+1) + arr[i-1];
            // System.out.println("array "+arr[i] +" = index "+ (i+1) +" prevValue "+ arr[i-1]);
            if(arr[i]<=n){
                // rowCount++;
                completedRow = i+1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                break;
            }
            System.out.println("i : "+i + " array : "+arr[i]);
        }
        
        return completedRow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        System.out.println(findCompleteRows(arr,n));
        sc.close();
    }
    
}
