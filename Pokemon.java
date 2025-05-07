public class Pokemon {
    String nome;
    String tipo;
    int ataque;
    int defesa;
    int velocidade;
    int hp;
    String habilidade;
    int xp;
    int nivel;
    String status;

    public Pokemon(String nome, String tipo, int ataque, int defesa, int velocidade, int hp, String habilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.hp = hp;
        this.habilidade = habilidade;
        this.xp = 0;
        this.nivel = 5;
        this.status = "normal";
    }

    public int calcularPoder(Pokemon oponente) {
        int bonusTipo = Tipo.temVantagem(this.tipo, oponente.tipo) ? 10 : 0;
        int bonusVelocidade = this.velocidade / 10;
        int bonusHabilidade = (this.habilidade.equals("Choque") || this.habilidade.equals("Chama")) ? 5 : 0;
        int aleatorio = (int)(Math.random() * 10);
        return ataque + bonusTipo + bonusVelocidade + bonusHabilidade + aleatorio;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ") - ATQ:" + ataque + " DEF:" + defesa + " VEL:" + velocidade + " HP:" + hp +
                " NIV:" + nivel + " Habilidade: " + habilidade;
    }
}
