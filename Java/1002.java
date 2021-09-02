
/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
Considerando para este problema que π = 3.14159:- Efetue o cálculo da área,
 elevando o valor de raio ao quadrado e multiplicando por π.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double r, area;
        double n = 3.14159;
        double raio;

        Scanner leia = new Scanner(System.in);
        r = leia.nextDouble();

        raio = r * r;
        area = n * raio;

        System.out.printf("A=%.4f\n", area);

    }

}
