package com.tt1.test;

import java.util.ArrayList;

/**
 * Servicio principal para la gestión de tareas ToDo.
 * Se encarga de crear tareas, gestionar correos de alerta
 * y consultar el estado de las mismas.
 */
public class Servicio {

    private Repositorio repositorio;
    private MailerStub mailer;

    /**
     * Constructor del servicio. Recibe las dependencias que necesita para funcionar.
     *
     * @param repositorio el repositorio donde se almacenan las tareas
     * @param mailer      el stub del mailer usado para enviar notificaciones
     */
    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    /**
     * Crea una nueva tarea ToDo con el nombre y fecha límite indicados
     * y la guarda en el repositorio.
     *
     * @param nombre      el nombre de la tarea
     * @param fechaLimite la fecha límite en formato texto
     * @return true si la tarea se creó correctamente
     */
    public boolean crearToDo(String nombre, String fechaLimite) {
        ToDo nuevaTarea = new ToDo();
        nuevaTarea.setNombre(nombre);
        repositorio.almacenarToDo(nuevaTarea);
        return true;
    }

    /**
     * Añade una dirección de correo electrónico para recibir alertas.
     *
     * @param email la dirección de correo a registrar
     * @return true si se añadió correctamente
     */
    public boolean agregarDireccionCorreo(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Marca una tarea como finalizada buscándola por su nombre.
     *
     * @param nombre el nombre de la tarea a marcar
     * @return true si se marcó correctamente
     */
    public boolean marcarTareaFinalizada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Devuelve la lista de tareas que aún no han sido completadas.
     *
     * @return lista de ToDos pendientes
     */
    public ArrayList<ToDo> consultarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    /**
     * Revisa si alguna tarea ha vencido y, en ese caso, envía
     * una alerta por correo a las direcciones registradas.
     */
    private void comprobarVencidasYAlertar() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
