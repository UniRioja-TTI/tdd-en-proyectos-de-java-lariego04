package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicioIntegracionTest {

	@Test
	void testIntegracion() {
		DBStub dbReal = new DBStub();
        Repositorio repoReal = new Repositorio(dbReal);
        MailerStub mailerReal = new MailerStub();
        
        Servicio servicio = new Servicio(repoReal, mailerReal);
        
        servicio.crearToDo("Prueba de Integracion", "2026-12-31");
        
        ToDo tareaGuardada = repoReal.encontrarToDo("Prueba de Integracion");
        
        assertNotNull(tareaGuardada, "La tarea debería haber llegado hasta la BD real");
        assertEquals("Prueba de Integracion", tareaGuardada.getNombre(), "El nombre debe coincidir");
	}

}
