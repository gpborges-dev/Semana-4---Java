public class ListagemClientesFaixaEtaria {
    public static void main(String[] args) {
        System.out.println("Listagem dos clientes");
        int anoAtual = 2024;
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("-".repeat(40));
        String fulano = "Fulano";
        System.out.println("Nome: " + fulano);
        int nascimentoFulano = 1980;
        System.out.println("Data de nascimento: " + nascimentoFulano);
        int idadeFulano = anoAtual - nascimentoFulano;
        System.out.println("Idade: " + idadeFulano);
        if (idadeFulano <= 17) {
            System.out.println("Característica Etária: ADOLESCENTE");
        } else if (idadeFulano <= 29) {
            System.out.println("Característica Etária: JOVEM");
        } else if (idadeFulano <= 59) {
            System.out.println("Característica Etária: ADULTO");
        } else {
            System.out.println("Característica Etária: IDOSO");
        }
        System.out.println("-".repeat(40));
        String sicrano = "Sicrano";
        System.out.println("Nome: " + sicrano);
        int nascimentoSicrano = 2000;
        System.out.println("Data de nascimento: " + nascimentoSicrano);
        int idadeSicrano = anoAtual - nascimentoSicrano;
        System.out.println("Idade: " + idadeSicrano);
        if (idadeSicrano <= 17) {
            System.out.println("Característica Etária: ADOLESCENTE");
        } else if (idadeSicrano <= 29) {
            System.out.println("Característica Etária: JOVEM");
        } else if (idadeSicrano <= 59) {
            System.out.println("Característica Etária: ADULTO");
        } else {
            System.out.println("Característica Etária: IDOSO");
        }
        System.out.println("-".repeat(40));
    }
}
