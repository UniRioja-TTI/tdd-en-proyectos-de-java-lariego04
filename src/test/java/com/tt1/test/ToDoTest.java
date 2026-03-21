package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToDoTest {

	@Test
	void test() {
		ToDo tarea = new ToDo();
        String nombreEsperado = "Hacer deberes ";
        tarea.setNombre(nombreEsperado);
        assertEquals(nombreEsperado, tarea.getNombre(), "El nombre de la tarea no coincide");
	}

}
