package modulo1.aula9;

import java.util.Scanner;

public class a9_exercicio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cabecalho();

        //ler números
        double n1 = ler_double();
        double n2 = ler_double();

        //soma
        double r1 = soma(n1, n2);
        //subtraçao
        double r2 = subt(n1, n2);
        //multiplicação
        double r3 = mult(n1, n2);
        //divisão
        double r4 = div(n1, n2);

        System.out.println("A soma entre " + n1 + " e " + n2 + " é = " + r1);
        System.out.println("A subtração entre " + n1 + " e " + n2 + " é = " + r2);
        System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é = " + r3);
        System.out.println("A divisão entre " + n1 + " e " + n2 + " é = " + r4);
    }

    static void cabecalho(){
        System.out.println("===== Atividade Calculadora =====");
    }

    //ler
    static double ler_double(){
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        return numero;
    }

    //soma
    static double soma(double num1, double num2){
        double resultado = num1 + num2;
        return resultado;
    }

    //subtração
    static double subt(double n1, double n2){
        double resultado = n1 - n2;
        return resultado;
    }
    //multiplicação
    static double mult(double n1, double n2){
        double resultado = n1 * n2;
        return resultado;
    }
    //divisão
    static double div(double n1, double n2){
        double resultado = n1 / n2;
        return resultado;
    }
}
