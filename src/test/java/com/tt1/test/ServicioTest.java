package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		DBStubMock dbFalso = new DBStubMock();
        Repositorio repo = new Repositorio(dbFalso);
        MailerStub mailerFalso = new MailerStub() {
            @Override
            public boolean enviarCorreo(String direccion, String mensaje) {
                return true; 
            }
        };
        
        Servicio servicio = new Servicio(repo, mailerFalso);
        
        boolean resultado = servicio.crearToDo("Aprender TDD", "2026-12-31");
        
        assertTrue(resultado, "El servicio debería devolver true al crear la tarea con éxito");
        
        assertNotNull(repo.encontrarToDo("Aprender TDD"), "La tarea debería haberse guardado en el repositorio");
	}

}
