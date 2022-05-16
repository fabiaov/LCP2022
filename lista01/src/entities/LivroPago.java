package entities;

public class LivroPago extends Livro {

    private String titulo;

    public LivroPago() {
    }

    public LivroPago(String titulo) {
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
        return "LivroPago: \n " +
                "titulo: '" + titulo + '\'';
    }
}
