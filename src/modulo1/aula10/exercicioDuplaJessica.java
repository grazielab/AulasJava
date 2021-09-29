
package modulo1.aula10;

import java.util.Scanner;

class CadastroDev {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        cabecalho();
        imprimeMenu();

        opcao = lerNumero("Escolha sua opção: ");
        escolhaMenu(opcao);
    }

    static void cabecalho() {
        System.out.println("====== Cadastros ======");
    }

    static void imprimeMenu() {
        System.out.println("1 - Cadastrar Desevolvedor");
        System.out.println("2 - Cadastrar Linguagem");
        System.out.println("3 - Sair");
    }

    static int lerNumero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static void escolhaMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastraDev();
                break;
            case 2:
                cadastraLinguagem();
                break;

            case 3:
                System.out.println("Saindo...");
                System.out.println("Obrigada por utilizar nosso cadastro!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    static void cadastraDev() {
        String nome, sobrenome, senioridade;
        short idade;

        System.out.println("\n====== Cadastro de Desenvolvedor ======\n");
        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
        } while (!validaNome(nome));

        do {
            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.nextLine();
        } while (!validaNome(sobrenome));

        System.out.print("Digite sua senioridade: ");
        senioridade = sc.nextLine();

        do {
            System.out.print("Digite sua idade: ");
            idade = Short.parseShort(sc.nextLine());
        } while (!validaIdade(idade));

        imprimeCadastroDev(nome, sobrenome, senioridade, idade);
    }

    static void cadastraLinguagem() {
        String nomeLinguagem, descricao;
        int aplicacao;

        System.out.println("\n====== Cadastro de Linguagem ======\n");
        do {
            System.out.print("Digite o nome da linguagem: ");
            nomeLinguagem = sc.nextLine();
        } while (!validaNome(nomeLinguagem));

        System.out.print("Digite a descrição da linguagem: ");
        descricao = sc.nextLine();

        do {
            System.out.println("Digite o número da aplicação desejada, sendo:");
            System.out.println(" 1 - Frontend");
            System.out.println(" 2 - Backend");
            System.out.println(" 3 - Mobile");
            aplicacao = sc.nextInt();
        } while (!validaAplicacao(aplicacao));

        imprimeCadastroLinguagem(nomeLinguagem, descricao, aplicacao);
    }

    static boolean validaNome(String nome) {
        boolean ehValido = true;

        if (nome.length() < 3) {
            System.out.println("O nome deve conter no mínimo 3 caracteres. Tente novamente!");
            ehValido = false;
        }
        return ehValido;
    }

    static boolean validaIdade(short idade) {
        boolean ehValido = true;

        if (idade <= 0) {
            System.out.println("A idade deve ser maior que 0. Tente novamente!");
            ehValido = false;
        }
        return ehValido;
    }

    static boolean validaAplicacao(int aplic) {
        boolean ehValido = true;

        if (aplic < 1 || aplic > 3) {
            System.out.println("Aplicação inválida! Tente novamente.");
            ehValido = false;
        }
        return ehValido;

    }

    static void imprimeCadastroDev(String nome, String sobrenome, String senioridade, short idade) {
        System.out.println("\n====== Ficha de cadastro ======\n");
        System.out.printf("Nome dev: %s %s\n", nome, sobrenome);
        System.out.printf("Senioridade: %s\n", senioridade);
        System.out.printf("Idade: %d anos\n", idade);
    }

    static void imprimeCadastroLinguagem(String nome, String descricao, int aplicacao) {
        System.out.println("\n====== Ficha de cadastro ======\n");
        System.out.printf("Nome linguagem: %s\n", nome);
        System.out.printf("Descrição: %s\n", descricao);

        if (aplicacao == 1) {
            System.out.println("Aplicação: Front-end");
        } else if (aplicacao == 2) {
            System.out.println("Aplicação: Back-end");
        } else if (aplicacao == 3) {
            System.out.println("Aplicação: Mobile");
        }
    }

}