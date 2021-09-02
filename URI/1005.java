
/*Leia 2 valores de ponto flutuante de dupla precisão A e B, 
que correspondem a 2 notas de um aluno. A seguir, calcule a 
média do aluno, sabendo que a nota A tem peso 3.5 e a nota B 
tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada 
nota pode ir de 0 até 10.0, sempre com uma casa decimal.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double a, b;
        double media;

        Scanner leia = new Scanner(System.in);
        a = leia.nextDouble();
        b = leia.nextDouble();

        media = ((a * 3.5) + (b * 7.5)) / (11.0);

        System.out.printf("MEDIA = %.5f\n", media);

    }

}
