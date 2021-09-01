//Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro
// elemento com o último, o segundo elemento com o penúltimo, etc., 
//até trocar o 10º com o 11º. Mostre o vetor modificado.
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        int v[], aux;
        v = new int[20];

        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 20; i++)
            v[i] = leia.nextInt();

        for(int i = 0, int j = 19; i < 10; i++, j--){
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
        }
        for(int i = 0; i < 20; i++)
            System.out.printf("N[%d] = %d\n", i, v[i]);
    }
 
}