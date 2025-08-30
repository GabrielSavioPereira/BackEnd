import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
    }

    public void imprimirPlaylist() {
        System.out.println("Playlist: " + nome);
        for (Musica m : musicas) {
            System.out.println("- " + m.getTitulo());
        }
    }
}
