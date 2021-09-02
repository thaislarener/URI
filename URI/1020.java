
/*Leia um valor inteiro correspondente à idade de uma pessoa em dias 
e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias 
e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que 
permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um 
exercício com objetivo de testar raciocínio matemático simples.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int idade;
        int ano, mes;

        Scanner leia = new Scanner(System.in);
        idade = leia.nextInt();

        ano = idade / 365;
        idade = idade % 365;

        mes = idade / 30;
        idade = idade % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", idade);
    }

}