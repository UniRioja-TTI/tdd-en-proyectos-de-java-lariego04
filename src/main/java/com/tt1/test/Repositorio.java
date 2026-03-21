package com.tt1.test;

/**
 * Repositorio encargado de gestionar el acceso a los datos de las tareas.
 * Actúa como intermediario entre el servicio y la base de datos simulada.
 */
public class Repositorio {

    private DBStub db;

    /**
     * Constructor del repositorio.
     *
     * @param db la base de datos stub con la que trabajará el repositorio
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }

    /**
     * Busca y devuelve una tarea por su nombre.
     *
     * @param nombre el nombre de la tarea a buscar
     * @return el ToDo correspondiente, o null si no existe
     */
    public ToDo encontrarToDo(String nombre) {
        return db.leerTarea(nombre);
    }

    /**
     * Marca una tarea existente como completada.
     *
     * @param nombre el nombre de la tarea a marcar
     */
    public void marcarComoCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Guarda una nueva tarea en la base de datos.
     *
     * @param tarea el objeto ToDo que se quiere almacenar
     */
    public void almacenarToDo(ToDo tarea) {
        db.crearTarea(tarea);
    }

    /**
     * Guarda una dirección de correo electrónico para notificaciones.
     *
     * @param email la dirección de correo a almacenar
     */
    public void almacenarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
