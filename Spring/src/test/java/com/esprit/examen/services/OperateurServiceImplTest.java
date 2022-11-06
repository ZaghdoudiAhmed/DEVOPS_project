package com.esprit.examen.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class OperateurServiceImplTest {

	@Mock
	OperateurRepository opRepo;
	
	@Autowired
	IOperateurService opService;
	
	@Test
	public void testAddOperateur(){
		Operateur op = new Operateur("nom1", "prenom", "12345678");
		Operateur operateur = opService.addOperateur(op);
		System.out.print("operateur test :"+operateur);
		assertNotNull(operateur.getIdOperateur());
		assertTrue(operateur.getNom().length()>3);
		assertTrue(operateur.getPassword().length()>7);
		opService.deleteOperateur(operateur.getIdOperateur());
	}
	@Test
	public void testDeleteOperateur(){
		Operateur op = new Operateur("nom1", "prenom", "12345678");
		Operateur operateur = opService.addOperateur(op);
		opService.deleteOperateur(operateur.getIdOperateur());
		assertNull(opService.retrieveOperateur(operateur.getIdOperateur()));
		
	}
	@Test
	public void testRetrieveAllOperateurs(){
		int numberOfOps = opService.retrieveAllOperateurs().size();
		Operateur op = new Operateur("nom1", "prenom", "12345678");
		Operateur operateur = opService.addOperateur(op);
		assertEquals(numberOfOps+1, opService.retrieveAllOperateurs().size());
		opService.deleteOperateur(operateur.getIdOperateur());
	}
}
