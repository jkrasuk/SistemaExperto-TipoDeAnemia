package forward;

import static utils.TestCaseUtils.assertResults;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.FactHandle;

import model.EnfermedadesPreexistentes;
import model.MuestraDeSangre;
import model.OrigenPatologia;
import model.Persona;
import model.TipoAnemia;
import model.enums.TiposAnemia;
import model.enums.OrigenPatologiasOpciones;
import utils.KnowledgeSessionHelper;

public class ForwardTestCases {

	String K_SESSION_NAME = "ksession-rules";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	public ForwardTestCases() {
	}

	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, K_SESSION_NAME);
//		sessionStatefull.addEventListener(agendaEventListener());
//		sessionStatefull.addEventListener(buildEventListener());
	}

	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}

	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}

	@Test
	public void anemiaFerropenicaTest() {

		print("Caso de prueba: Anemia ferropenica");

		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(35.0);
		muestra.setHemoglobinaCorspucularMedia(20.0);
		muestra.setVolumenCorpuscularMedio(70.0);
		muestra.setSideremia(30.0);
		muestra.setTransferrina(380.0);
		muestra.setFerritina(4.0);
		muestra.setAmplitudDistribucionEritrocitaria(15.0);
		muestra.setReticulocitos(40000.0);
		muestra.setHematies(3000000.0);
		muestra.setFolato(10.0);
		muestra.setVitaminaB12(100.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.Si);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);

		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);

		sessionStatefull.insert(persona);
		
		Agenda agenda = sessionStatefull.getAgenda();
		
		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaFerropenica.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void anemiaHemoliticaTest() {

		print("Caso de prueba: Anemia hemolitica");

		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(30.0);
		muestra.setVolumenCorpuscularMedio(90.0);
		muestra.setSideremia(180.0);
		muestra.setTransferrina(150.0);
		muestra.setFerritina(100.0);
		muestra.setAmplitudDistribucionEritrocitaria(12.0);
		muestra.setReticulocitos(80000.0);
		muestra.setHematies(100000.0);
		muestra.setFolato(13.0);
		muestra.setVitaminaB12(300.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);
		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);

		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaHemolitica.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void anemiaCelulasFalciformesTest() {

		print("Caso de prueba: Anemia de células falciformes");
		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(30.0);
		muestra.setVolumenCorpuscularMedio(90.0);
		muestra.setSideremia(180.0);
		muestra.setTransferrina(450.0);
		muestra.setFerritina(100.0);
		muestra.setAmplitudDistribucionEritrocitaria(17.0);
		muestra.setReticulocitos(80000.0);
		muestra.setHematies(6000000.0);
		muestra.setFolato(13.0);
		muestra.setVitaminaB12(300.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.Si);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);
		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);
		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaDeCelulasFalciformes.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void anemiaMegaloblasticaTest() {

		print("Caso de prueba: Anemia megaloblastica");
		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(32.0);
		muestra.setVolumenCorpuscularMedio(130.0);
		muestra.setHemoglobinaCorspucularMedia(40.0);

		muestra.setSideremia(70.0);
		muestra.setTransferrina(300.0);
		muestra.setFerritina(100.0);
		muestra.setAmplitudDistribucionEritrocitaria(17.0);
		muestra.setReticulocitos(30000.0);
		muestra.setHematies(3000000.0);
		muestra.setFolato(1.0);
		muestra.setVitaminaB12(100.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);
		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);
		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaMegaloblastica.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void anemiaSideroblasticaTest() {

		print("Caso de prueba: Anemia sideroblástica");
		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(35.0);
		muestra.setHemoglobinaCorspucularMedia(20.0);
		muestra.setVolumenCorpuscularMedio(70.0);
		muestra.setSideremia(100.0);
		muestra.setTransferrina(370.0);
		muestra.setFerritina(400.0);
		muestra.setAmplitudDistribucionEritrocitaria(17.0);
		muestra.setReticulocitos(30000.0);
		muestra.setHematies(4000000.0);
		muestra.setFolato(13.0);
		muestra.setVitaminaB12(300.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);

		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);

		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaSideroblastica.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void anemiaAplasicaTest() {

		print("Caso de prueba: Anemia aplasica");
		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(30.0);
		muestra.setVolumenCorpuscularMedio(90.0);
		muestra.setSideremia(180.0);
		muestra.setTransferrina(180.0);
		muestra.setFerritina(400.0);
		muestra.setAmplitudDistribucionEritrocitaria(12.0);
		muestra.setReticulocitos(50000.0);
		muestra.setHematies(50000.0);
		muestra.setFolato(13.0);
		muestra.setVitaminaB12(300.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);

		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);

		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.AnemiaAplasica.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@Test
	public void personaSinAnemiaTest() {

		print("Caso de prueba: Persona sin anemia");
		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(43.0);
		muestra.setHemoglobinaCorspucularMedia(30.0);
		muestra.setVolumenCorpuscularMedio(90.0);
		muestra.setSideremia(100.0);
		muestra.setTransferrina(300.0);
		muestra.setFerritina(200.0);
		muestra.setAmplitudDistribucionEritrocitaria(12.0);
		muestra.setReticulocitos(50000.0);
		muestra.setHematies(5000000.0);
		muestra.setFolato(13.0);
		muestra.setVitaminaB12(500.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(OrigenPatologiasOpciones.No);
		origen.setEnfermedadDrepanocitica(OrigenPatologiasOpciones.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones.No);
		origen.setInfeccionesProlongadas(OrigenPatologiasOpciones.No);
		origen.setRasgoDrepanocitico(OrigenPatologiasOpciones.No);
		origen.setTrastornoInmunitario(OrigenPatologiasOpciones.No);

		EnfermedadesPreexistentes enfermedad = new EnfermedadesPreexistentes();
		enfermedad.setOrigen(origen);

		TipoAnemia tipoAnemia = new TipoAnemia();

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);
		persona.setTipoAnemia(tipoAnemia);

		sessionStatefull.insert(persona);
		Agenda agenda = sessionStatefull.getAgenda();

		// En primer lugar, se tiene el ultimo conjunto de reglas a ejecutar
		agenda.getAgendaGroup("diagnosticoFinal").setFocus();
		agenda.getAgendaGroup("morfologiaAnemia").setFocus();
		agenda.getAgendaGroup("enfermedad").setFocus();
		agenda.getAgendaGroup("nivelesDeComponentesDeSangre").setFocus();

		sessionStatefull.fireAllRules();

		TiposAnemia diagnostico = persona.getTipoAnemia().getDiagnostico();

		String valorEsperado = TiposAnemia.NoDeterminado.toString();
		print(persona);
		assertResults(diagnostico, valorEsperado);
	}

	@SuppressWarnings("unused")
	private RuleRuntimeEventListener buildEventListener() {
		return new RuleRuntimeEventListener() {
			@Override
			public void objectUpdated(ObjectUpdatedEvent event) {

				System.out.println("Object updated \n" + event.getObject().toString());
			}

			@Override
			public void objectInserted(ObjectInsertedEvent event) {
				System.out.println("Object inserted \n" + event.getObject().toString());
			}

			@Override
			public void objectDeleted(ObjectDeletedEvent event) {
				System.out.println("Object deleted \n" + event.getOldObject().toString());
			}
		};
	}

	private AgendaEventListener agendaEventListener() {
		return new AgendaEventListener() {
			@Override
			public void matchCreated(MatchCreatedEvent event) {
				// TODO Auto-generated method stub
			}

			@Override

			public void matchCancelled(MatchCancelledEvent event) {
				// TODO Auto-generated method stub
			}

			@Override

			public void beforeMatchFired(BeforeMatchFiredEvent event) {
				// TODO Auto-generated method stub
			}

			@Override
			public void afterMatchFired(AfterMatchFiredEvent event) {
				System.out.println("The rule " + event.getMatch().getRule().getName() + " has be fired");
			}

			@Override
			public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void agendaGroupPopped(AgendaGroupPoppedEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void agendaGroupPushed(AgendaGroupPushedEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
				// TODO Auto-generated method stub

			}

		};
	}
}
