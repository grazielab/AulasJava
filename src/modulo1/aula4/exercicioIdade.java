package modulo1.aula4;

import java.util.Scanner;

public class exercicioIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:  \n");
        String nome = sc.nextLine();

        System.out.println("Informe seu sobrenome:  \n");
        String sobrenome = sc.nextLine();

        System.out.println("Informe sua idade:  \n");
        int idade = sc.nextInt();

        if (idade < 18){
            System.out.println("O cadastro não pode ser realizado pois o cliente é menor de idade.");

        }else{
            System.out.println("Cadastro realizado com sucesso!!");
            System.out.println("Cliente: "+ nome +" "+ sobrenome);
            System.out.println("Idade: " + idade);
        }

    }
}
