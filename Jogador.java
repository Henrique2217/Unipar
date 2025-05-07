import java.util.ArrayList;
import java.util.List;

public class Jogador {
    String nickname;
    List<Pokemon> time = new ArrayList<>();
    int vitorias = 0;

    public Jogador(String nickname) {
        this.nickname = nickname;
    }

    public void adicionarPokemon(Pokemon p) {
        if (time.size() < 3) {
            time.add(p);
        } else {
            System.out.println("O time já tem 3 pokémons.");
        }
    }

    public String getNickname() {
        return nickname;
    }

    public List<Pokemon> getTime() {
        return time;
    }

    public void adicionarVitoria() {
        vitorias++;
    }

    public int getVitorias() {
        return vitorias;
    }
}
