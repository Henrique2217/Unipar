import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE BATALHA POKÉMON ===");

        System.out.print("Nickname do Jogador 1: ");
        Jogador jogador1 = new Jogador(sc.nextLine());

        System.out.print("Nickname do Jogador 2: ");
        Jogador jogador2 = new Jogador(sc.nextLine());

        montarTime(jogador1, sc);
        montarTime(jogador2, sc);

        Batalha.iniciar(jogador1, jogador2);
        sc.close();
    }

    private static void montarTime(Jogador jogador, Scanner sc) {
        System.out.println("\n" + jogador.getNickname() + ", monte seu time:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Escolha o Pokémon " + (i + 1) + ":");
            mostrarPokemonsDisponiveis();
            String escolha = sc.nextLine().trim();

            Pokemon escolhido = criarPokemon(escolha);
            if (escolhido != null) {
                jogador.adicionarPokemon(escolhido);
            } else {
                System.out.println("Pokémon inválido. Tente novamente.");
                i--;
            }
        }
    }

    private static void mostrarPokemonsDisponiveis() {
        System.out.println("- Charmander");
        System.out.println("- Squirtle");
        System.out.println("- Bulbasaur");
        System.out.println("- Pikachu");
    }

    private static Pokemon criarPokemon(String nome) {
        switch (nome.toLowerCase()) {
            case "charmander":
                return new Pokemon("Charmander", "fogo", 52, 43, 65, 39, "Chama");
            case "squirtle":
                return new Pokemon("Squirtle", "água", 48, 65, 43, 44, "Torrente");
            case "bulbasaur":
                return new Pokemon("Bulbasaur", "grama", 49, 49, 45, 45, "Cura Verde");
            case "pikachu":
                return new Pokemon("Pikachu", "elétrico", 55, 40, 90, 35, "Choque");
            default:
                return null;
        }
    }
}
