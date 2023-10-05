package org.example;

public interface AccionesComentario {
    boolean editarComentario(Comentario comentario, String nuevoTexto);
    boolean eliminarComentario(Comentario comentario);
}
