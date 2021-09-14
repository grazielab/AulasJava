package modulo1.aula4;

import java.util.Scanner;

public class exercicioCadastroFilmes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-Vindo ao programa Upflix! Cadastre seus filmes, series e" +
                            " qualquer outro entretenimento. Selecione abaixo a opção desejada.");

        System.out.println("Cadastro");

        System.out.println("\t 1 - Cadastro de filmes");
        System.out.println("\t 2 - Cadastro de séries");
        System.out.println("\t 3 - Cadastro de documentários");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do filme: ");
                String nomeFilme = sc.nextLine();
                System.out.println("Digite descrição do filme: ");
                String descFilme = sc.nextLine();
                System.out.println("Digite o genêro do filme: ");
                String generoFilme = sc.nextLine();
                System.out.println("Digite o ano de lançamento do filme: ");
                int anoFilme = sc.nextInt();

                System.out.println("Cadastro realizado com sucesso!! \n");
                System.out.println("Filme: "+ nomeFilme );
                System.out.println("Descrição: " + descFilme);
                System.out.println("Genêro: " + generoFilme);
                System.out.println("Lançamento: " + anoFilme);
                break;

            case 2:
                System.out.println("Digite o nome da série: ");
                String nomeSerie = sc.nextLine();
                System.out.println("Digite o ano de lançamento da série: ");
                int anoSerie = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome da produtora: ");
                String produtora = sc.nextLine();

                System.out.println("Cadastro realizado com sucesso!! \n");
                System.out.println("Série: "+ nomeSerie );
                System.out.println("Lançamento: " + anoSerie);
                System.out.println("Tema: " + produtora);
                break;

            case 3:
                System.out.println("Digite o nome do documentário: ");
                String nomeDoc = sc.nextLine();
                System.out.println("Digite o ano de lançamento: ");
                int anoDoc = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o tema do documentário: ");
                String temaDoc = sc.nextLine();

                System.out.println("Cadastro realizado com sucesso!! \n");
                System.out.println("Filme: "+ nomeDoc );
                System.out.println("Lançamento: " + anoDoc);
                System.out.println("Tema: " + temaDoc);
                break;
        }
    }
}