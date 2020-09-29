package model;

import model.enums.ExistingDiseaseOptions;

public class EnfermedadPreexistente {
	private OrigenPatologia origen;

	private ExistingDiseaseOptions DeficienciaDeHierro, DeficienciaDeVitaminaB12YFolatos, EnfermedadesCronicas,
			GlobulosRojosConFormaDefectuosa, DestruccionDeGlobulosRojosAntesDeLoNormal, BajaProduccionDeGlobulosRojos,
			AcumulacionExcesivaDeHierro, DeficitHereditarioDeHemoglobina;

	
	public EnfermedadPreexistente() {
		super();
		origen = new OrigenPatologia();
		
		//Inicializo
		this.DeficienciaDeHierro = ExistingDiseaseOptions.No;
		this.DeficienciaDeVitaminaB12YFolatos = ExistingDiseaseOptions.No;
		this.EnfermedadesCronicas = ExistingDiseaseOptions.No;
		this.GlobulosRojosConFormaDefectuosa = ExistingDiseaseOptions.No;
		this.DestruccionDeGlobulosRojosAntesDeLoNormal = ExistingDiseaseOptions.No;
		this.BajaProduccionDeGlobulosRojos = ExistingDiseaseOptions.No;
		this.AcumulacionExcesivaDeHierro = ExistingDiseaseOptions.No;
		this.DeficitHereditarioDeHemoglobina = ExistingDiseaseOptions.No;
	}

	public OrigenPatologia getOrigen() {
		return origen;
	}

	public void setOrigen(OrigenPatologia origen) {
		this.origen = origen;
	}

	public ExistingDiseaseOptions getDeficienciaDeHierro() {
		return DeficienciaDeHierro;
	}

	public void setDeficienciaDeHierro(ExistingDiseaseOptions deficienciaDeHierro) {
		DeficienciaDeHierro = deficienciaDeHierro;
	}

	public ExistingDiseaseOptions getDeficienciaDeVitaminaB12YFolatos() {
		return DeficienciaDeVitaminaB12YFolatos;
	}

	public void setDeficienciaDeVitaminaB12YFolatos(ExistingDiseaseOptions deficienciaDeVitaminaB12YFolatos) {
		DeficienciaDeVitaminaB12YFolatos = deficienciaDeVitaminaB12YFolatos;
	}

	public ExistingDiseaseOptions getEnfermedadesCronicas() {
		return EnfermedadesCronicas;
	}

	public void setEnfermedadesCronicas(ExistingDiseaseOptions enfermedadesCronicas) {
		EnfermedadesCronicas = enfermedadesCronicas;
	}

	public ExistingDiseaseOptions getGlobulosRojosConFormaDefectuosa() {
		return GlobulosRojosConFormaDefectuosa;
	}

	public void setGlobulosRojosConFormaDefectuosa(ExistingDiseaseOptions globulosRojosConFormaDefectuosa) {
		GlobulosRojosConFormaDefectuosa = globulosRojosConFormaDefectuosa;
	}

	public ExistingDiseaseOptions getDestruccionDeGlobulosRojosAntesDeLoNormal() {
		return DestruccionDeGlobulosRojosAntesDeLoNormal;
	}

	public void setDestruccionDeGlobulosRojosAntesDeLoNormal(
			ExistingDiseaseOptions destruccionDeGlobulosRojosAntesDeLoNormal) {
		DestruccionDeGlobulosRojosAntesDeLoNormal = destruccionDeGlobulosRojosAntesDeLoNormal;
	}

	public ExistingDiseaseOptions getBajaProduccionDeGlobulosRojos() {
		return BajaProduccionDeGlobulosRojos;
	}

	public void setBajaProduccionDeGlobulosRojos(ExistingDiseaseOptions bajaProduccionDeGlobulosRojos) {
		BajaProduccionDeGlobulosRojos = bajaProduccionDeGlobulosRojos;
	}

	public ExistingDiseaseOptions getAcumulacionExcesivaDeHierro() {
		return AcumulacionExcesivaDeHierro;
	}

	public void setAcumulacionExcesivaDeHierro(ExistingDiseaseOptions acumulacionExcesivaDeHierro) {
		AcumulacionExcesivaDeHierro = acumulacionExcesivaDeHierro;
	}

	public ExistingDiseaseOptions getDeficitHereditarioDeHemoglobina() {
		return DeficitHereditarioDeHemoglobina;
	}

	public void setDeficitHereditarioDeHemoglobina(ExistingDiseaseOptions deficitHereditarioDeHemoglobina) {
		DeficitHereditarioDeHemoglobina = deficitHereditarioDeHemoglobina;
	}


}
