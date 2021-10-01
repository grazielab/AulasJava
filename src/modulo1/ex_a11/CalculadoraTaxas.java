public class CalculadoraTaxas {
    
    private int qtdSaque;
    private double taxaTransferencia = 0.001;
    private double taxaSaque = 1.30;

    public double taxaTransferencia(double valor){
        double resultado = valor * taxaTransferencia;
        return resultado;
    }

    public double taxaSaque(double valor){
        qtdSaque++;
        double resultado = 0;

        if (qtdSaque % 5 == 0){
            return taxaSaque;
        }
        return resultado;
    }
}   
    
