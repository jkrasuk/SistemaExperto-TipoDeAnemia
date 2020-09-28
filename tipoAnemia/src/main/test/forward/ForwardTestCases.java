package forward;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import utils.KnowledgeSessionHelper;

public class ForwardTestCases {

	String K_SESSION_NAME = "ksession-rules";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;

	public ForwardTestCases() {
	}

	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, K_SESSION_NAME);
		// OutputDisplay outputDisplay = new OutputDisplay();
		// sessionStatefull.addEventListener(buildEventListener());
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
		assertEquals(0, 0);

	}

	@Test
	public void anemiaHemoliticaTest() {

		print("Caso de prueba: Anemia hemolitica");

	}

	@Test
	public void anemiaCelulasFalciformesTest() {

		print("Caso de prueba: Anemia de células falciformes");

	}

	@Test
	public void anemiaMegaloblasticaTest() {

		print("Caso de prueba: Anemia megaloblastica");

	}

	@Test
	public void anemiaSideroblasticaTest() {

		print("Caso de prueba: Anemia sideroblástica");

	}

	@Test
	public void anemiaAplasicaTest() {

		print("Caso de prueba: Anemia aplasica");

	}

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
}
