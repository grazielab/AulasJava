package modulo1.aula7;

import java.util.Scanner;

public class exercicio_primos_FOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 150; i++){
            boolean primo = true;
            for (int cont = 2; cont < i; cont++){
                if (i % cont == 0){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }
    }
}
