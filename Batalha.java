public class Batalha {
    public static void iniciar(Jogador j1, Jogador j2) {
        System.out.println("\n⚔️ Batalha entre " + j1.getNickname() + " e " + j2.getNickname());

        int pontosJ1 = 0;
        int pontosJ2 = 0;

        for (int i = 0; i < 3; i++) {
            Pokemon p1 = j1.getTime().get(i);
            Pokemon p2 = j2.getTime().get(i);

            System.out.println("\n🎮 Round " + (i + 1));
            System.out.println(j1.getNickname() + " escolhe: " + p1);
            System.out.println(j2.getNickname() + " escolhe: " + p2);

            int poder1 = p1.calcularPoder(p2);
            int poder2 = p2.calcularPoder(p1);

            System.out.println("Poder de " + p1.nome + ": " + poder1);
            System.out.println("Poder de " + p2.nome + ": " + poder2);

            if (poder1 > poder2) {
                pontosJ1++;
                p1.xp += 20;
                System.out.println("✅ " + j1.getNickname() + " vence o round!");
            } else if (poder2 > poder1) {
                pontosJ2++;
                p2.xp += 20;
                System.out.println("✅ " + j2.getNickname() + " vence o round!");
            } else {
                System.out.println("🤝 Empate!");
            }
        }

        System.out.println("\n📊 Resultado final:");
        System.out.println(j1.getNickname() + ": " + pontosJ1 + " ponto(s)");
        System.out.println(j2.getNickname() + ": " + pontosJ2 + " ponto(s)");

        if (pontosJ1 > pontosJ2) {
            j1.adicionarVitoria();
            System.out.println("🏆 " + j1.getNickname() + " venceu a batalha!");
        } else if (pontosJ2 > pontosJ1) {
            j2.adicionarVitoria();
            System.out.println("🏆 " + j2.getNickname() + " venceu a batalha!");
        } else {
            System.out.println("🤝 Batalha empatada!");
        }
    }
}
