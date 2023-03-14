package br.pucrs;
import java.util.Random;
public class App{
    public static void main(String[] args) {

        Algorithms algorithms = new Algorithms();

        long[] vectorA = new long[32];
        long[] vectorB = new long[2048];
        long[] vectorC = new long[1048576];

        System.out.println("=========================================");
        System.out.println("VECTOR A");
        algorithms.print(vectorA);

        System.out.println("========================================");
        System.out.println("VECTOR B");
        algorithms.print(vectorB);

        System.out.println("=========================================");
        System.out.println("VECTOR C");
        algorithms.print(vectorC);

    }
}