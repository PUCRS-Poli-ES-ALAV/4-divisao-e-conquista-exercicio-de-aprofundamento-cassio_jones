package br.pucrs;

import org.jetbrains.annotations.NotNull;

import java.sql.Time;
import java.util.Random;

import static java.lang.Long.max;

public class Algorithms {
    long timer = System.nanoTime();
    //INSERT METHOD
    public void insert(@NotNull long[] vector){
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(vector.length*2);
        }
    }

    //EXERCISE II
    public int counterA, counterB = 0;

    public long maxVal1(@NotNull long A[]) {
        long max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
            counterA++;
        }
        return max;
    }
    //EXERCISE III
    public long maxVal2(long A[], int init, int end) {
        if (end - init <= 1) {
            counterB++;
            return max(A[init], A[end]);
        } else {
            int m = (init + end)/2;
            long v1 = maxVal2(A,init,m);
            counterB++;
            long v2 = maxVal2(A,m+1,end);
            counterB++;
            return max(v1,v2);
        }
    }
    public void print(long[] vector){
        insert(vector);
        maxVal1(vector);
        long resultB1 = System.nanoTime() - timer;
        System.out.println("Iterations: "+counterA);
        System.out.println("Elapsed Time: "+resultB1);
        maxVal2(vector, 0, vector.length-1);
        System.out.println("Iterations: "+counterB);
        long result = System.nanoTime() - timer;
        System.out.println("Elapsed Time: "+result);
    }
}
