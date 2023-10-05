package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Moderador moderador = new Moderador("Moderador");
        Usuario usuarioNormal1 = new Usuario("UsuarioNormal1",false);
        Usuario usuarioNormal2 = new Usuario("UsuarioNormal2",false);

        // Crear blog
        Blog miBlog = new Blog();

        // Agregar usuarios al blog
        miBlog.agregarUsuario(moderador);
        miBlog.agregarUsuario(usuarioNormal1);
        miBlog.agregarUsuario(usuarioNormal2);

        // Agregar comentarios al blog
        Comentario comentario1 = new Comentario("¡Hola mundo!", usuarioNormal1.getNombre());
        Comentario comentario2 = new Comentario("Este comentario debe ser eliminado.", usuarioNormal2.getNombre());
        miBlog.agregarComentario(comentario1, usuarioNormal1);
        miBlog.agregarComentario(comentario2, usuarioNormal2);

        // El moderador edita el comentario 1
        //miBlog.editarComentario(comentario1, moderador, "¡Este comentario ha sido editado por el moderador!");

        // El usuario normal 1 intenta editar el comentario 2 (no debería permitirse)
        boolean usuarioPuedeEditar1 = miBlog.editarComentario(comentario2, usuarioNormal1, "¡Este comentario ha sido editado por el usuario normal 1!");
        if (!usuarioPuedeEditar1) {
            System.out.println("El usuario normal 1 no puede editar este comentario.");
        }

        // El usuario normal 2 intenta eliminar el comentario 1 (no debería permitirse)
        boolean usuarioPuedeEliminar2 = miBlog.eliminarComentario(comentario1, usuarioNormal2);
        if (!usuarioPuedeEliminar2) {
            System.out.println("El usuario normal 2 no puede eliminar este comentario.");
        }

        // El moderador elimina el comentario 2
        //miBlog.eliminarComentario(comentario2, moderador);

        // Obtener todos los comentarios
        List<Comentario> comentarios = miBlog.obtenerComentarios();
        for (Comentario comentario : comentarios) {
            System.out.println(comentario.getAutor() + ": " + comentario.getTexto());
        }
    }
}