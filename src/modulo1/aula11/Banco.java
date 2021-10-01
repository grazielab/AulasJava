public class Banco {
    public static void main(String[] args) {
        contaCorrente cc1 = new contaCorrente();
        
        System.out.println(cc1.saldo());
        cc1.depositar(1000);
        
        System.out.println(cc1.saldo());
        cc1.sacar(50);

        System.out.println(cc1.saldo());
    }
}