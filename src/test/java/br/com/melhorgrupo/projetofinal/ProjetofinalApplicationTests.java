package br.com.melhorgrupo.projetofinal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.melhorgrupo.projetofinal.service.TransferenciaService;

@SpringBootTest
@ActiveProfiles("test")
class ProjetofinalApplicationTests {
	
	@Autowired
	private TransferenciaService trans;
	
	@Test
	public void transferenciaTeste() {
		boolean teste = trans.transferirValores(1, 3, 2000);
		assertTrue(teste);
	}
}
