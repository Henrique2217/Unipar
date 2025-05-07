import java.util.HashMap;
import java.util.Map;

public class Tipo {
    private static final Map<String, String> vantagens = new HashMap<>();

    static {
        vantagens.put("fogo", "grama");
        vantagens.put("grama", "água");
        vantagens.put("água", "fogo");
        vantagens.put("elétrico", "água");
    }

    public static boolean temVantagem(String tipoA, String tipoB) {
        return vantagens.containsKey(tipoA) && vantagens.get(tipoA).equals(tipoB);
    }
}
