
/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do
que C e se D for maior do que A, e a soma de C com D for maior que 
a soma de A e B e se C e D, ambos, forem positivos e se a variável 
A for par escrever a mensagem "Valores aceitos", senão escrever 
"Valores nao aceitos".*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, d;
        int aceito = 1;

        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

        if (b > c && d > a)
            if ((c + d) > (a + b))
                if (c > 0 && d > 0)
                    if (a % 2 == 0)
                        aceito = 0;

        if (aceito == 0)
            System.out.printf("Valores aceitos\n");
        else
            System.out.printf("Valores nao aceitos\n");

    }

}