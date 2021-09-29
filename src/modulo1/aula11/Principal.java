public class Principal{
  
    public static void main(String[] args) {
        System.out.println("Programa de Cadastros");
        Produto p1 = new Produto();
        p1.nome = "TV";
        p1.descricao = "Smart 55 polegadas";
        p1.quantidade = 10;
        p1.valor = 499.99;

        System.out.println(p1.nome);
        System.out.println(p1.descricao);
        System.out.println(p1.quantidade);
        System.out.println(p1.valor);
    }
}