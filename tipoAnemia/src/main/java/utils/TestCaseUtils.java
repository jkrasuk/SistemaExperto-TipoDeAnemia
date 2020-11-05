package utils;

import java.util.List;

import model.EnfermedadesPreexistentes;
import model.Persona;
import model.enums.MorfologiasAnemia;
import model.enums.TiposAnemia;

public class TestCaseUtils {

	//////////////// TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(Persona persona) {

		MorfologiasAnemia morfologia = persona.getTipoAnemia().getMorfologia();
		TiposAnemia tipoAnemia = persona.getTipoAnemia().getDiagnostico();

		print();
		print("Persona");
		print("Enfermedades Preexistentes: ");
		printDiseases(persona.getEnfermedadPreexistente());
		print("Morfología de anemia: " + morfologia);
		print("Tipo de anemia: " + tipoAnemia);
		print();
	}

	private static void printDiseases(EnfermedadesPreexistentes enfermedadPreexistente) {

		print();
		print("\t Acumulación excesiva de hierro: " + enfermedadPreexistente.getAcumulacionExcesivaDeHierro());
		print("\t Deficiencia de vitamina B12 y folatos: "
				+ enfermedadPreexistente.getDeficienciaDeVitaminaB12YFolatos());
		print("\t Enfermedades cronicas: " + enfermedadPreexistente.getEnfermedadesCronicas());
		print("\t Globulos rojos con forma defectuosa: " + enfermedadPreexistente.getGlobulosRojosConFormaDefectuosa());
		print("\t Deficit hereditario de hemoglobina: " + enfermedadPreexistente.getDeficitHereditarioDeHemoglobina());
		print();
	}

	public static void assertResults(TiposAnemia diagnostico, String valorEsperado) {

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
