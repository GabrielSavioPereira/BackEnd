public class Postagem {
    private String titulo;
    private String descricao;
    private String tipo; // texto, imagem, video

    public Postagem(String titulo, String descricao, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo.toLowerCase();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }
}
