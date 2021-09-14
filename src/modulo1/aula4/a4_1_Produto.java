package modulo1.aula4;

public class a4_1_Produto {

    public static void main(String[] args) {
        boolean verdade = true; // 1 - com sinal eletrico - pulso eletrico
        boolean falso = false;  // 0 - sem sinal pulso eletrico

        //boolean ve = 5 >= 5;

        int n1 = 5;
        int n2 = 6;

        if (n1 > n2) {
            System.out.println("Verdade");
        }else if (n1 < n2) {
            System.out.println("Falso");
        }else{
            System.out.println("Igual");
        }
    }
}