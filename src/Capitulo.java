import java.util.Scanner;

class Capitulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem, int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = new Scanner(System.in);
    }

    public void mostrar() {
        System.out.println("\n" + nome + "\n");
        System.out.println(texto);
        System.out.println("Escolha a próxima ação:");

        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((i + 1) + ". " + escolhas[i]);
        }
    }

    public int escolher() {
        int opcao;
        do {
            opcao = escaneador.nextInt();
        } while (opcao < 1 || opcao > escolhas.length);

        return opcao - 1;
    }
}