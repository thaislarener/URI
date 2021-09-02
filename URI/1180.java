/*Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N].
 A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor
  e a sua posição dentro do vetor, mostrando esta informação.*/
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  
    public static void main(String[] args) throws IOException {
        int v[], x;
        int menor, pos;
 
        Scanner leia = new Scanner(System.in);
        x = leia.nextInt();
        v = new int[x];

        for(int i = 0; i < x; i++)
            v[i] = leia.nextInt();
        
        menor = v[0];
        pos = 0;
        for(int i = 0; i < x; i++){
            if(v[i] < menor){
                menor = v[i];
                pos = i;
            }
        }

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", pos);
     }
  
 }