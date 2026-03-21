package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MailerStubTest {

	@Test
	void test() {
		MailerStub mailer = new MailerStub();
        String correoDestino = "profesor@unirioja.es";
        String mensaje = "He terminado la practica";
        boolean resultado = mailer.enviarCorreo(correoDestino, mensaje);
        assertTrue(resultado, "El método debería devolver true al enviar el correo con éxito");
	}

}
