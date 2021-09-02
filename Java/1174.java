//Faça um programa que leia um vetor A[100]. No final, mostre todas
// as posições do vetor que armazenam um valor menor ou igual a 10 
// e o valor armazenado em cada uma das posições.
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        float v[];
        v = new float[100];

        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            v[i] = leia.nextFloat();
            if(v[i] <= 10.00)
                System.out.printf("A[%d] = %.1f\n", i, v[i]);
        }   
    }
 
}