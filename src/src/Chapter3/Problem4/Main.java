package Chapter3.Problem4;

import java.util.*;

public class Main {
    static int selectionSort(int[] A, int N){
        int sw = 0;
        int minj;
        for(int i = 0; i < N - 1; i++){
            minj = i;
            for(int j = i; j < N; j++){
                if(A[j] < A[minj]) minj = j;
            }
            swap(A, i, minj);
            if(i != minj) sw++;
        }
        return sw;
    }
    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Arrays.setAll(A, i -> sc.nextInt());
        sc.close();

        int sw = selectionSort(A, N);
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i < N - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(sw);
    }
}
