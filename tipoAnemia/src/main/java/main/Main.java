package main;

import static utils.TestCaseUtils.print;

import org.junit.BeforeClass;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import model.EnfermedadPreexistente;
import model.MuestraDeSangre;
import model.OrigenPatologia;
import model.Persona;
import model.enums.ComponentLevel;
import model.enums.PatologyOriginOptions;
import utils.KnowledgeSessionHelper;
import utils.OutputDisplay;

public class Main {
	static String K_SESSION_NAME = "ksession-rules";

	static KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;

	public static void main(String[] args) {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, K_SESSION_NAME);

		print("Caso de prueba: Anemia ferropenica");

		MuestraDeSangre muestra = new MuestraDeSangre();
		muestra.setHematocrito(35.0);
		muestra.setVolumenCorpuscularMedio(20.0);
		muestra.setHemoglobinaCorspucularMedia(60.0);
		muestra.setSideremia(30.0);
		muestra.setTransferrina(380.0);
		muestra.setFerritina(4.0);
		muestra.setAmplitudDistribucionEritrocitaria(15.0);
		muestra.setReticulocitos(40000.0);
		muestra.setHematies(3000000.0);

		OrigenPatologia origen = new OrigenPatologia();
		origen.setCancer(PatologyOriginOptions.No);
		origen.setDeficienciaDeFolatos(PatologyOriginOptions.No);
		origen.setDeficienciaDeHierro(PatologyOriginOptions.Si);
		origen.setDeficienciaDeVitaminaB12(PatologyOriginOptions.No);
		origen.setEnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos(PatologyOriginOptions.No);
		origen.setEnfermedadDrepanocítica(PatologyOriginOptions.No);
		origen.setGenDeProduccionDeHemoglobinaDefectuoso(PatologyOriginOptions.No);
		origen.setHemocromatosis(PatologyOriginOptions.No);
		origen.setInfeccionesProlongadas(PatologyOriginOptions.No);
		origen.setRasgoDrepanocítico(PatologyOriginOptions.No);
		origen.setTrastornoInmunitario(PatologyOriginOptions.No);
		origen.setVelocidadDeRegeneracionDeGlobulosRojosBaja(PatologyOriginOptions.No);

		EnfermedadPreexistente enfermedad = new EnfermedadPreexistente();
		enfermedad.setOrigen(origen);

		Persona persona = new Persona();
		persona.setMuestraDeSangre(muestra);
		persona.setEnfermedadPreexistente(enfermedad);

//		FactHandle automovilDir = sessionStatefull.insert(persona);
//		sessionStatefull.insert(persona);
//		sessionStatefull.fireAllRules();
//		persona = (Persona) sessionStatefull.getObject(automovilDir);
		  persona.getMuestraDeSangre().setNivelHematocrito(ComponentLevel.Bajo);
		Boolean test = persona.getMuestraDeSangre().getNivelHematocrito().isa(ComponentLevel.Alto);

		System.out.println(persona.toString());
	}
}
