package modulo1.aula6;

import java.util.Scanner;

public class exercicio_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int cont = 1; cont < 5; cont++){
            System.out.println("Digite seu nome: ");
            String nome= sc.nextLine();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.printf("Usuario %d: %s foi cadastrado. Cadastre novamente: \n", cont, nome, sobrenome);
        }
        System.out.println("Cadastro finalizado com sucesso!");
    }
}