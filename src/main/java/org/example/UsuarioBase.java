package org.example;

public class UsuarioBase implements AccionesComentario {
    protected String nombre;
    protected boolean esModerador;
    public UsuarioBase(String nombre, boolean esModerador) {
        this.nombre = nombre;
        this.esModerador = esModerador;
    }
    // Implementación predeterminada de editarComentario (puede ser sobrescrita)
    public boolean editarComentario(Comentario comentario, String nuevoTexto) {
        // Por defecto, los usuarios normales no pueden editar comentarios
        return false;
    }

    // Implementación predeterminada de eliminarComentario (puede ser sobrescrita)
    public boolean eliminarComentario(Comentario comentario) {
        // Por defecto, los usuarios normales no pueden eliminar comentarios
        return false;
    }
    public boolean esModerador() {
        return false; // Los usuarios base no son moderadores
    }
    public String getNombre() {
        return nombre;
    }
}
