public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        System.out.println("Pontuação aumentada para " + this.pontuacao);
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("Jogador subiu para o nível " + this.nivel);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
    }
}