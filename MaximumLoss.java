// Problem-1
// You are given a list of daily prices of a stock. You can buy a stock on one day and sell it later on another day after the day you bought the stock. You can perform the above operation only once. What is the maximum loss possible?
// Example
// Price=[1,2,3,4]
// The Price went up every day. Return 0.
// Example
// Prices=[10,4,2,9]
// The greatest loss is incurred when you buy at a price of 10 and sell at a price of 2. Return the difference:8.

import java.util.*;
class MaximumLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int price[] = new int[size];
        for(int i=0;i<size;i++){
            price[i] =  sc.nextInt();
        }
        System.out.println("Maximu loss is : "+findLoss(price,size));
        sc.close();
    }
    public static int findLoss(int arr[],int size){
        int maxPrice = arr[0];
        int maxLoss = 0;
        for(int i=1;i<size;i++){
            int price = arr[i];
            int loss = maxPrice - price;

            if(loss > maxLoss){
                maxLoss = loss;
            }
            if(price > maxPrice){
                maxPrice = price;
            }
        }
        return maxLoss;
    }
}