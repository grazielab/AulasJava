package modulo1.aula7;

import java.util.Scanner;

public class exercicio_WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        while (contador < 10) {
            System.out.printf("\n %s %s", nome, sobrenome);
            contador++;

        }
    }
}

