package Chapter3.Problem3;

import java.util.*;

public class Main {

    static int bubbleSort(int[] A, int N){
        int swapCount = 0;
        boolean flag = true;
        for(int i = 0; flag; i++){
            flag = false;
            for(int j = N - 1; j >= i + 1; j--){
                if(A[j] < A[j-1]){
                    swap(A, j, j-1);
                    flag = true;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    static void swap (int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Arrays.setAll(A, i -> sc.nextInt());
        int swapCount = bubbleSort(A, N);
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(swapCount);
    }
}
