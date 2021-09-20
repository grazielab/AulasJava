package modulo1.aula5;

import java.util.Scanner;

public class exercicio_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println(" Bem-vindo a área de cadastros! \n");
        System.out.println(" Selecione a opção desejada \n");

        System.out.println("\t 1 - Cadastrar Cliente");
        System.out.println("\t 2 - Listar Clientes");
        System.out.println("\t 3 - Sair");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                String nome = "";
                String sobrenome = "";
                String cpfCliente = "";
                String rgCliente = "";

                System.out.println(" Cadastrar clientes \n ");
                while (invalido) {
                    System.out.println("Digite seu nome: \n");
                     nome = sc.nextLine();
                    if (nome.length() <= 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o nome");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;

                while (invalido) {
                    System.out.println("Digite seu sobrenome: \n");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() <= 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente seu sobrenome");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;

                while (invalido) {
                    System.out.println("Digite seu CPF: \n");
                    cpfCliente = sc.nextLine();
                    if (cpfCliente.length() < 11) {
                        System.out.println("O CPF deve ter 11 caracteres");
                        System.out.println("Digite novamente seu CPF");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;

                while (invalido) {
                    System.out.println("Digite seu RG: \n");
                    rgCliente = sc.nextLine();
                    if (rgCliente.length() == 4) {
                        System.out.println("O RG deve ter mais de 4 caracteres");
                        System.out.println("Digite novamente seu RG");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;

                System.out.println("Cadastro concluido com sucesso!! \n");
                System.out.println("Cliente: " + nome + " " + sobrenome);
                System.out.println("CPF: " + cpfCliente);
                System.out.println("RG: " + rgCliente);

                break;

            case 2:
                System.out.println(" ---- Lista de Clientes Indisponivel ----");
                break;

            case 3:
                System.out.println("Saindo ...");
                break;
                default:
                }

        }
}
//END PROGRAM