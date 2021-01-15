package it.manytomanyjpamaven.test;

import java.util.Date;
import java.util.List;

import it.manytomanyjpamaven.dao.EntityManagerUtil;
import it.manytomanyjpamaven.model.Ruolo;
import it.manytomanyjpamaven.model.StatoUtente;
import it.manytomanyjpamaven.model.Utente;
import it.manytomanyjpamaven.service.MyServiceFactory;
import it.manytomanyjpamaven.service.RuoloService;
import it.manytomanyjpamaven.service.UtenteService;

public class ManyToManyTest {

	public static void main(String[] args) {
		UtenteService utenteServiceInstance = MyServiceFactory.getUtenteServiceInstance();
		RuoloService ruoloServiceInstance = MyServiceFactory.getRuoloServiceInstance();

		// ora passo alle operazioni CRUD
		try {
//
//			// inizializzo i ruoli sul db
//			initRuoli(ruoloServiceInstance);

//			System.out.println("\n LISTA UTENTI \n ");
//			for (Utente utenteItem : utenteServiceInstance.listAll()) {
//				System.out.println(utenteItem);
//			}
			
//			System.out.println("\n LISTA RUOLI \n ");
//			for (Ruolo ruoloItem : ruoloServiceInstance.listAll()) {
//				System.out.println(ruoloItem);
//			}

//			System.out.println("\n NUOVO UTENTE CON RUOLO \n ");
//			Utente utenteNuovo = new Utente("SuperMario", "psw", "Mario", "Rossi", new Date());
//			utenteServiceInstance.inserisciNuovo(utenteNuovo);
//			Ruolo ruoloDaDb = ruoloServiceInstance.caricaSingoloElemento(1L);
//			if (utenteNuovo != null) {
//				utenteServiceInstance.aggiungiRuolo(utenteNuovo, ruoloDaDb);
//			}
			
//			System.out.println("\n NUOVO RUOLO \n");
//			Ruolo nuovoRuolo = new Ruolo("Megadirettore Galattico", "MEGA_DIRETTORE");
//			ruoloServiceInstance.inserisciNuovo(nuovoRuolo);
//			if(ruoloServiceInstance.caricaSingoloElemento(nuovoRuolo.getId()) != null)
//				System.out.println("Nuovo ruolo inserito: "+nuovoRuolo);
			
			// proviamo a passarlo nello stato ATTIVO
//			Utente utenteDaDb2 = utenteServiceInstance.listAll().stream().findFirst().orElse(null);
//			if (utenteDaDb2 != null) {
//				System.out.println(
//						"stato attuale dell'utente :" + utenteDaDb2.getUsername() + " " + utenteDaDb2.getStato());
//				utenteDaDb2.setStato(StatoUtente.ATTIVO);
//				utenteServiceInstance.aggiorna(utenteDaDb2);
//				System.out.println(
//						"stato nuovo dell'utente :" + utenteDaDb2.getUsername() + " " + utenteDaDb2.getStato());
//			}
			
			
			
			System.out.println("\n RIMOZIONE RUOLO \n ");
			Ruolo ruoloDaDb2 = ruoloServiceInstance.caricaSingoloElemento(7L);
			if (ruoloDaDb2 != null) {
				ruoloServiceInstance.rimuovi(ruoloDaDb2);
			}
			
//			System.out.println("\n RIMOZIONE UTENTE \n ");
//			Utente utenteDaDb2 = utenteServiceInstance.caricaSingoloElemento(4L);
//			if (utenteDaDb2 != null) {
//				utenteServiceInstance.rimuovi(utenteDaDb2);
//			}
			
//			// proviamo a passarlo nello stato ATTIVO
//			Utente utenteDaDb2 = utenteServiceInstance.listAll().stream().findFirst().orElse(null);
//			if (utenteDaDb2 != null) {
//				System.out.println(
//						"stato attuale dell'utente :" + utenteDaDb2.getUsername() + " " + utenteDaDb2.getStato());
//				utenteDaDb2.setStato(StatoUtente.ATTIVO);
//				utenteServiceInstance.aggiorna(utenteDaDb2);
//				System.out.println(
//						"stato nuovo dell'utente :" + utenteDaDb2.getUsername() + " " + utenteDaDb2.getStato());
//			}

//			System.out.println("\n UPDATE RUOLO \n");
//			Ruolo ruoloPresoDaDb = ruoloServiceInstance.caricaSingoloElemento(7L);
//			if (ruoloPresoDaDb != null) {
//				System.out.println(
//						"descrizione attuale del ruolo: " + ruoloPresoDaDb.getDescrizione());
//				String nuovaDescrizione = "Operatore";
//				ruoloPresoDaDb.setDescrizione(nuovaDescrizione);
//				ruoloServiceInstance.aggiorna(ruoloPresoDaDb);
//				System.out.println(
//						"descrizione aggiornata del ruolo: " + ruoloPresoDaDb.getDescrizione());
//			}
			
//			System.out.println("\n UPDATE UTENTE \n");
//			Utente utentePresoDaDb = utenteServiceInstance.caricaSingoloElemento(5L);
//			if (utentePresoDaDb != null) {
//				System.out.println(
//						"username attuale dell'utente: " + utentePresoDaDb.getUsername());
//				String nuovoUsername = "Mariotto";
//				utentePresoDaDb.setUsername(nuovoUsername);
//				utenteServiceInstance.aggiorna(utentePresoDaDb);
//				System.out.println(
//						"titolo aggiornato del utente: " + utentePresoDaDb.getUsername());
//			}
			
//			System.out.println("\n CERCA UTENTI PER RUOLO & RUOLI PER DESCRIZIONE E CODICE\n");
//			Ruolo ruoloMegaDirettore = ruoloServiceInstance.cercaPerDescrizioneECodice("Megadirettore Galattico", "MEGA_DIRETTORE");
//			List<Utente> listaUtentiRuoloMegaDirettore = utenteServiceInstance.cercaUtentiPerRuolo(ruoloMegaDirettore);
//			for (Utente utenteItem : listaUtentiRuoloMegaDirettore) {
//				System.out.println("Lista MegaDirettori: ");
//				System.out.println(utenteItem);
//			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}

	private static void initRuoli(RuoloService ruoloServiceInstance) throws Exception {
		if (ruoloServiceInstance.cercaPerDescrizioneECodice("Administrator", "ROLE_ADMIN") == null) {
			ruoloServiceInstance.inserisciNuovo(new Ruolo("Administrator", "ROLE_ADMIN"));
		}

		if (ruoloServiceInstance.cercaPerDescrizioneECodice("Classic User", "ROLE_CLASSIC_USER") == null) {
			ruoloServiceInstance.inserisciNuovo(new Ruolo("Classic User", "ROLE_CLASSIC_USER"));
		}
	}

}
