package br.pucrs;

import org.jetbrains.annotations.NotNull;

import java.sql.Time;
import java.util.Random;

import static java.lang.Long.max;

public class Algorithms {


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
}
