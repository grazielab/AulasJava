import java.util.Scanner;

public class PrincipalBanco {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    CalculadoraTaxas c = new CalculadoraTaxas();
    boolean continua = false;
    do {

      System.out.println("Escolha uma operação");
      System.out.println("1 - Transferencia");
      System.out.println("2 - Saque");
      System.out.println("3 - Sair");

      int opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {

        case 1:
          System.out.println("Digite o valor para transferencia: ");
          double valorT = Double.parseDouble(sc.nextLine());
          double taxaT = c.taxaTransferencia(valorT);
          System.out.printf("A taxa de transferencia foi de R$ %.2f \n", taxaT);

          break;

        case 2:
          System.out.println("Digite o valor para saque: ");
          double saque = Double.parseDouble(sc.nextLine());
          double taxaS = c.taxaSaque(saque);
          System.out.printf("A taxa de saque foi de R$ %.2f \n", taxaS);
          break;

        case 3:
          System.out.println("Saindo ...");
          break;

      }

      System.out.println("Deseja voltar para o menu principal?");
      char resposta = sc.nextLine().toUpperCase().charAt(0);
      if (resposta == 'S') {
        continua = true;
      }
    } while (continua);
  }
}