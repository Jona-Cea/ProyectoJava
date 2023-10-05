package org.example;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Comentario> comentarios;
    private List<UsuarioBase> usuarios;

    public Blog() {
        comentarios = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(UsuarioBase usuario) {
        usuarios.add(usuario);
    }

    public void agregarComentario(Comentario comentario, Usuario autor) {
        comentarios.add(comentario);
    }

    public boolean editarComentario(Comentario comentario, UsuarioBase autor, String nuevoTexto) {
        // Un usuario normal solo puede editar sus propios comentarios
        if (!autor.esModerador() && comentarios.contains(comentario) && comentario.getAutor().equals(autor.getNombre())) {
            comentario.setTexto(nuevoTexto);
            return true;
        }
        // El moderador puede editar cualquier comentario
        if (autor.esModerador() && comentarios.contains(comentario)) {
            comentario.setTexto(nuevoTexto);
            return true;
        }
        return false;
    }

    public boolean eliminarComentario(Comentario comentario, UsuarioBase autor) {
        // El moderador puede eliminar cualquier comentario
        if (autor.esModerador() && comentarios.contains(comentario)) {
            comentarios.remove(comentario);
            return true;
        }
        return false;
    }

    public List<Comentario> obtenerComentarios() {
        return comentarios;
    }
}
