package model.enums;

public enum ExistingDiseases {
	DeficienciaDeHierro, DeficienciaDeVitaminaB12YFolatos, EnfermedadesCronicas, GlobulosRojosConFormaDefectuosa,
	DestruccionDeGlobulosRojosAntesDeLoNormal, BajaProduccionDeGlobulosRojos, AcumulacionExcesivaDeHierro,
	DeficitHereditarioDeHemoglobina;

	public Boolean isa(ExistingDiseases disease) {

		return this.toString() == disease.toString();

	}
}