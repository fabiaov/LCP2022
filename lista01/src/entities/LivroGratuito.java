package entities;

public class LivroGratuito extends Livro {

    private String titulo;

    public LivroGratuito() {
    }

    public LivroGratuito(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "LivroGratuito: \n " +
                "titulo: '" + titulo + '\'';
    }
}
