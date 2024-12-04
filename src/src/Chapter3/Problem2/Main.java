package Chapter3.Problem2;

// This problem is available at https://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_A
// The problem is about Insertion sort
// Insertion sort is a simple sorting algorithm where you sort a dataset by "inserting" the numbers from the second card
// and inserting them into the left cards so as to make the left cards a sorted set.
// the time complexity for this algorithm is O(N^2) and its space complexity is O(1).
// You can read more about it here: https://www.geeksforgeeks.org/time-and-space-complexity-of-insertion-sort-algorithm/

import java.util.*;

public class Main {
    static void trace(int[] A, int N){
        for(int i=0; i < N; i++ ){
            if(i>0) System.out.print(" ");
            System.out.println(A[i]);
        }
    }

    static void insertionSort(int[] A, int N){
        int v;
        for(int i=1; i < N; i++){
            v = A[i];
            int j = i-1;
            while(j>=0 && A[j] > v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            trace(A, N);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        trace(A, N);
        insertionSort(A, N);
    }
}
