package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepositorioTest {

	@Test
	void test() {
        DBStubMock dbFalso = new DBStubMock();
        Repositorio repo = new Repositorio(dbFalso);
        
        ToDo tarea = new ToDo();
        tarea.setNombre("Estudiar Java");

        repo.almacenarToDo(tarea);
        ToDo resultado = repo.encontrarToDo("Estudiar Java");

        assertEquals("Estudiar Java", resultado.getNombre(), "El repositorio debería recuperar la tarea correcta");
	}

}
