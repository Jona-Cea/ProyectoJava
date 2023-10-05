package org.example;

public class Comentario {
    private String texto;
    private String autor;

    public Comentario(String texto, String autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
