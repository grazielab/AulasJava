package modulo1.aula7;

import java.util.Scanner;

public class exercicio_INVESTIMENTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorInvest = 5000, juros = 0.02, retornoMensal = 0.0, totalRetorno = 0.0;
        int meses = 24;

        System.out.println(" O retorno total do investimento é de: ");

        for (int i = 0; i < meses; i++){
            retornoMensal = valorInvest * juros;
            valorInvest += retornoMensal;
            System.out.printf("\t Mês %d: R$ %.2f \n", i+1, valorInvest);
            totalRetorno = retornoMensal;

        }
        System.out.printf("O valor total de retorno foi: R$ %.2f \n", totalRetorno);
    }
}