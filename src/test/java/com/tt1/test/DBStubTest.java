package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class DBStubTest {

	@Test
	void test() {
		DBStub db = new DBStub();
        String emailPrueba = "alumno@unirioja.es";

        db.guardarEmail(emailPrueba);
        ArrayList<String> listaEmails = db.obtenerEmails();

        assertNotNull(listaEmails, "La lista de emails no debería ser nula");
        assertEquals(1, listaEmails.size(), "Debería haber exactamente 1 email en la agenda");
        assertTrue(listaEmails.contains(emailPrueba), "La lista debería contener el email guardado");
	}

}
