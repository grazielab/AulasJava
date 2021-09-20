package modulo1.aula7;

import java.util.Scanner;

public class exercicio_FOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        for(int contador = 1; contador < 10; contador++){
            System.out.printf("\n %s %s", nome, sobrenome);

        }
    }
}