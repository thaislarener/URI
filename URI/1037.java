
/*Você deve fazer um programa que leia um valor qualquer e apresente uma 
mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], 
(75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum 
destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000  */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        float x;

        Scanner leia = new Scanner(System.in);
        x = leia.nextFloat();

        if (x >= 0.0 && x <= 25.0)
            System.out.printf("Intervalo [0,25]\n");
        else if (x > 25.0 && x <= 50.0)
            System.out.printf("Intervalo (25,50]\n");
        else if (x > 50.0 && x <= 75.0)
            System.out.printf("Intervalo (50,75]\n");
        else if (x > 75.0 && x <= 100.0)
            System.out.printf("Intervalo (75,100]\n");
        else
            System.out.printf("Fora de intervalo\n");

    }

}