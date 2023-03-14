package br.pucrs;
import java.util.Random;
public class App{
    public static void main(String[] args) {
        long timer = System.nanoTime();
        Algorithms algorithms = new Algorithms();

        long[] vectorA = new long[32];
        long[] vectorB = new long[2048];
        long[] vectorC = new long[1048576];

        Random rd = new Random();

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = rd.nextInt(64);
        }
        System.out.println("=========================================");
        System.out.println("VECTOR A");
        algorithms.maxVal1(vectorA);
        System.out.println("Iterations: "+algorithms.counterA);
        algorithms.maxVal2(vectorA, 0, 31);
        System.out.println("Iterations: "+algorithms.counterB);




        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = rd.nextInt(4095);
        }
        //long resultB = System.nanoTime() - resultA;
        System.out.println("========================================");
        System.out.println("VECTOR B");
        algorithms.maxVal1(vectorA);
        System.out.println("Iterations: "+algorithms.counterA);
        algorithms.maxVal2(vectorB, 0, 2047);
        System.out.println("Iterations: "+algorithms.counterB);




        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = rd.nextInt(2000000);
        }
        System.out.println("=========================================");
        System.out.println("VECTOR C");
        //System.out.println("Elapsed Time: "+resultC);
        algorithms.maxVal1(vectorC);
        System.out.println("Iterations: "+algorithms.counterA);
        algorithms.maxVal2(vectorC, 0, 1048575);
        System.out.println("Iterations: "+algorithms.counterB);


    }
}