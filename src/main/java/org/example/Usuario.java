package org.example;

public class Usuario extends UsuarioBase {
    public Usuario(String nombre, boolean esModerador) {
        super(nombre, esModerador);
    }
    public boolean editarComentario(Comentario comentario, String nuevoTexto) {
        // Usuario normal solo puede editar sus propios comentarios
        if (comentario.getAutor().equals(nombre)) {
            comentario.setTexto(nuevoTexto);
            return true;
        }
        return false; // No se permite la edición del comentario
    }
}
