/*Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. 
Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado
 na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.*/
 import java.io.IOException;
 import java.util.Scanner;
 
 public class Main {
  
     public static void main(String[] args) throws IOException {
         double v[], x;
         v = new double[100];
 
         Scanner leia = new Scanner(System.in);
         x = leia.nextDouble();
         
         for(int i = 0; i < 100; i++){
             v[i] = x;
             x = x / 2.00;
             System.out.printf("N[%d] = %.4f\n", i, v[i]);
         }
     }
  
 }