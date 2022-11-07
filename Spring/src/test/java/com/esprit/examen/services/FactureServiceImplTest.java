//package com.esprit.examen.services;
//
//
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.esprit.examen.entities.Facture;
//import com.esprit.examen.entities.Operateur;
//import com.esprit.examen.repositories.OperateurRepository;
//
//@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//public class FactureServiceImplTest {
//	@Mock
//	OperateurRepository operateurRepository;
//	
//	@Autowired
//	IFactureService factureService;
//	
//	@InjectMocks
//	private OperateurServiceImpl operateurService;
//	
//	@Test
//	public void testassignOperateurToFacture() throws ParseException{
//		Operateur o = new Operateur(2L,"nom1","prenom","password");
//		Mockito.doReturn(Optional.of(o)).when(operateurRepository).findById(Mockito.anyLong()).get();
////		Mockito.when(operateurService.retrieveOperateur((long)2)).thenReturn(o);
////		Mockito.when(operateurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(o));
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateCreationFacture = dateFormat.parse("10/06/2005");
//		Date dateDerniereModificationFacture = dateFormat.parse("20/03/2011");
//		Facture f = new Facture(10F, 20F, dateCreationFacture, dateDerniereModificationFacture);
//		Facture facture = factureService.addFacture(f);
//		factureService.assignOperateurToFacture(operateurService.retrieveOperateur(2L).getIdOperateur(),facture.getIdFacture());
//		//assertThat(o.getFactures().contains(facture));
//		//factureService.deleteFacture(facture.getIdFacture());
//		
//	}
//	
//}
