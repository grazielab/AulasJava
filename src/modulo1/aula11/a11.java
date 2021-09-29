
public class a11 {
    public static void main(String[] args) {
        int numero = -10;
        // Criando uma instancia da classe produto(objeto)
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "Smart";
        produto1.valor = 4999.99;

        Produto produto2 = new Produto();
        produto2.nome = "Celular";
        produto2.descricao = "Iphone 11";
        produto2.valor = 4999.99;

        System.out.println(numero);
        System.out.println(produto1.nome);
        System.out.println(produto2.nome);

    }

}