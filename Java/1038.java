
/*Com base na tabela abaixo, escreva um programa que leia o código 
de um item e a quantidade deste item. A seguir, calcule e mostre o 
valor da conta a pagar.
CODIGO ESPECIFICAÇÃO      PREÇO
1      Cachorro quente    4.00
2      X Salada           4.50
3      X Bacon            5.00
4      Torrada            2.00
5      Refrigerante       1,50  */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int prod;
        int quant;
        double total = 0.0;

        Scanner leia = new Scanner(System.in);
        prod = leia.nextInt();
        quant = leia.nextInt();

        if (prod == 1)
            total = quant * 4.0;
        if (prod == 2)
            total = quant * 4.5;
        if (prod == 3)
            total = quant * 5.0;
        if (prod == 4)
            total = quant * 2.0;
        if (prod == 5)
            total = quant * 1.5;

        System.out.printf("Total: R$ %.2f\n", total);

    }

}
