import java.util.Scanner;

public class PrincipalBanco {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    CalculadoraTaxas c = new CalculadoraTaxas();
    boolean continua = false;

    System.out.println("Bem-vindos a Calculadora de Taxas!! \n");

    do {
      System.out.println("Escolha uma operação: \n ");
      System.out.println("1 - Transferencia");
      System.out.println("2 - Saque");

      int opcao = Integer.parseInt(sc.nextLine());
      if(opcao < 1 || opcao > 2){
        System.out.println("Opção inválida. Digite novamente! ");
      }
      
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
      }

      System.out.println("Deseja voltar para o menu principal? (S/N)");
      char resposta = sc.nextLine().toUpperCase().charAt(0);
      if (resposta == 'S') {
        continua = true;
      }
      else if (resposta != 'S' && resposta != 'N' ){
        System.out.println("Resposta inválida! Tente novamente. \n");
        continua = true;
      }
      else{
        System.out.println("Obrigada por utilizar nossa calculadora. Volte sempre! ");
        continua = false;
      }
    } while (continua);
  }
}
