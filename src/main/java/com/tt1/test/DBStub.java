package com.tt1.test;

import java.util.HashMap;
import java.util.ArrayList;

public class DBStub {
    
	private HashMap<String, ToDo> tareas = new HashMap<>();
    private ArrayList<String> emails = new ArrayList<>();
    public void crearTarea(ToDo tarea) {
    	this.tareas.put(tarea.getNombre(), tarea);
    }
    
    public ToDo leerTarea(String nombreTarea) {
    	return this.tareas.get(nombreTarea);
    }
    
    public void actualizarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    
    public void borrarTarea(String nombreTarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarEmail(String email) {
    	this.emails.add(email);
    }
    
    public ArrayList<String> obtenerEmails() {
    	return this.emails;
    }
}