package com.tt1.test;

/**
 * Representa una tarea pendiente (ToDo) con su información básica:
 * nombre, descripción, fecha límite y estado de completado.
 */
public class ToDo {

    private String nombre;
    private String descripcion;
    private String fechaLimite;
    private boolean completado;

    /**
     * Devuelve el nombre de la tarea.
     *
     * @return el nombre de la tarea
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre de la tarea.
     *
     * @param nombre el nombre que se quiere dar a la tarea
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
