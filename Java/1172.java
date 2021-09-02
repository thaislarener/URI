
/*Faça um programa que leia um vetor X[10]. Substitua a seguir, 
todos os valores nulos e negativos do vetor X por 1. Em seguida 
mostre o vetor X.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int v[];
        v = new int[10];

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            v[i] = leia.nextInt();
            if (v[i] <= 0)
                v[i] = 1;
            System.out.printf("X[%d] = %d\n", i, v[i]);
        }
    }

}