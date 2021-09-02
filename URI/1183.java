//Leia um caractere maiúsculo, que indica uma operação que deve ser realizada
//e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média 
//considerando somente aqueles elementos que estão acima da diagonal principal da matriz.
import java.io.IOException;
import java.util.Scanner;
    
 public class Main {
    public static void main(String[] args) throws IOException {
        float m[][] = new float[12][12];
        double soma = 0, media = 0;
        String tipo, som="S", med="M";
        int linha = 0, coluna = 1, cont = 1;;
    
        Scanner leia = new Scanner(System.in);
        tipo = leia.next();
   
        for(int i = 0; i < 12; i++)
            for(int j = 0; j < 12; j++)
                m[i][j] = leia.nextFloat();
         
        if(tipo.equals(som)){
            while(linha < 11){
                while(coluna < 12){
                    soma += m[linha][coluna];
                    coluna++;
                }
                cont++;
                coluna = cont;
                linha++;
            }
            System.out.printf("%.1f\n", soma);
        }
 
        else if(tipo.equals(med)){
            while(linha < 11){
                while(coluna < 12){
                    media += m[linha][coluna];
                    coluna++;
                }
                cont++;
                coluna = cont;
                linha++;
            }
            media /= ((12 * 12) - 12) / 2;
            System.out.printf("%.1f\n", media);
        }
    }   
}