package org.example;

public class Moderador extends UsuarioBase{
    public Moderador(String nombre) {
        super(nombre, true);
    }
    @Override
    public boolean editarComentario(Comentario comentario, String nuevoTexto) {
        // Moderador puede editar cualquier comentario
        comentario.setTexto(nuevoTexto);
        return true;
    }

    @Override
    public boolean eliminarComentario(Comentario comentario) {
        // Moderador puede eliminar cualquier comentario
        return true;
    }
    public boolean esModerador() {
        return true; // Los moderadores sí son moderadores
    }
}
