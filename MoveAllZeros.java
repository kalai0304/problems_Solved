import java.util.Scanner;

public class MoveAllZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                arr[index++] = arr[i];
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
