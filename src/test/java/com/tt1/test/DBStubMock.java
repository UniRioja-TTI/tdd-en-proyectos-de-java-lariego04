package com.tt1.test;

public class DBStubMock extends DBStub{
	private ToDo tareaGuardada; 
    public void crearTarea(ToDo tarea) {
        this.tareaGuardada = tarea; 
    }

    public ToDo leerTarea(String nombreTarea) {
        return this.tareaGuardada;
    }

}
