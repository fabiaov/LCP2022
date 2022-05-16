package entities;

public abstract class Livro {

    private String titulo;

    public Livro() {
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void setTitulo(String titulo);
}
