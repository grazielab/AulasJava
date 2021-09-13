package modulo1.aula3;

import java.util.Scanner;

public class Produto {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Cadastro de Produtos \n");
        System.out.println("  Seja-Vindo! Digite as informações solicitadas.  ");

        System.out.print("\t Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("\t Digite o modelo do produto: ");
        String descricao = sc.nextLine();

        System.out.print("\t Digite a categoria do produto: ");
        String categoria = sc.nextLine();

        System.out.print("\t Digite o valor do produto: ");
        float valor = sc.nextFloat();

        System.out.println("Cadastro realizado com sucesso! \n");

        System.out.println("  Cadastro de Produto  ");
        System.out.printf("\n\t Produto - %s", produto, "\n");
        System.out.printf("\n\t Modelo - %s", descricao, "\n");
        System.out.printf("\n\t Categoria - %s", categoria, "\n");
        System.out.printf("\n\t Valor - %s", valor, "\n");

        System.out.println("\n Volte sempre !!!");

    }
}
