public class Principal{

    public static void main(String[] args) {
        System.out.println("CADASTRO DE PESSOAS \n");
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Graziela"; 
        p1.sobrenome = "Bartyra Bressanini Beckhauser";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "Lilith";
        p2.sobrenome = "Beckhauser";
        p2.idade = 7;

        //Pessoa 1
        System.out.println("Nome completo: " + p1.nome + " " + p1.sobrenome);
        System.out.println("Idade: " + p1.idade);

        //Pessoa 2
        System.out.println("Nome completo: " + p2.nome + " " + p2.sobrenome);
        System.out.println("Idade: " + p2.idade);

    }

}