package utils;

import model.Persona;
import model.enums.AnemiaMorfology;
import model.enums.AnemiaTypes;
import model.enums.ExistingDiseases;

public class TestCaseUtils {

	//////////////// TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(Persona persona) {

		ExistingDiseases enfermedad = persona.getEnfermedadPreexistente().getEnfermedad();
		AnemiaMorfology morfologia = persona.getMuestraDeSangre().getTipoAnemia().getMorfologia();
		AnemiaTypes tipoAnemia = persona.getMuestraDeSangre().getTipoAnemia().getDiagnostico();

		print();
		print("Persona");
		print("Enfermedad Preexistente: " + enfermedad);
		print("Morfología de anemia: " + morfologia);
		print("Tipo de anemia: " + tipoAnemia);
		print();
	}

	public static void assertResults(AnemiaTypes diagnostico, String valorEsperado) {

		String diagnosticoFinal = diagnostico.toString();

		printResults(diagnosticoFinal, valorEsperado);

		assert (diagnosticoFinal.equals(valorEsperado));
	}

	private static void printResults(String result, String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: " + condition);
	}
}
