package model;

import model.enums.EnfermedadesPreexistentesOpciones;

public class EnfermedadesPreexistentes {
	public OrigenPatologia origen;

	public EnfermedadesPreexistentesOpciones deficienciaDeVitaminaB12YFolatos, enfermedadesCronicas,
			globulosRojosConFormaDefectuosa,
			acumulacionExcesivaDeHierro, deficitHereditarioDeHemoglobina;

	
	public EnfermedadesPreexistentes() {
		super();
		origen = new OrigenPatologia();
		
		//Inicializo
		this.deficienciaDeVitaminaB12YFolatos = EnfermedadesPreexistentesOpciones.No;
		this.enfermedadesCronicas = EnfermedadesPreexistentesOpciones.No;
		this.globulosRojosConFormaDefectuosa = EnfermedadesPreexistentesOpciones.No;
		this.acumulacionExcesivaDeHierro = EnfermedadesPreexistentesOpciones.No;
		this.deficitHereditarioDeHemoglobina = EnfermedadesPreexistentesOpciones.No;
	}

	
	@Override
	public String toString() {
		return "EnfermedadesPreexistentes [origen=" + origen + ", deficienciaDeVitaminaB12YFolatos="
				+ deficienciaDeVitaminaB12YFolatos + ", enfermedadesCronicas=" + enfermedadesCronicas
				+ ", globulosRojosConFormaDefectuosa=" + globulosRojosConFormaDefectuosa
				+ ", acumulacionExcesivaDeHierro=" + acumulacionExcesivaDeHierro + ", deficitHereditarioDeHemoglobina="
				+ deficitHereditarioDeHemoglobina + "]";
	}


	public EnfermedadesPreexistentesOpciones getDeficienciaDeVitaminaB12YFolatos() {
		return deficienciaDeVitaminaB12YFolatos;
	}


	public void setDeficienciaDeVitaminaB12YFolatos(EnfermedadesPreexistentesOpciones deficienciaDeVitaminaB12YFolatos) {
		this.deficienciaDeVitaminaB12YFolatos = deficienciaDeVitaminaB12YFolatos;
	}


	public EnfermedadesPreexistentesOpciones getEnfermedadesCronicas() {
		return enfermedadesCronicas;
	}


	public void setEnfermedadesCronicas(EnfermedadesPreexistentesOpciones enfermedadesCronicas) {
		this.enfermedadesCronicas = enfermedadesCronicas;
	}


	public EnfermedadesPreexistentesOpciones getGlobulosRojosConFormaDefectuosa() {
		return globulosRojosConFormaDefectuosa;
	}


	public void setGlobulosRojosConFormaDefectuosa(EnfermedadesPreexistentesOpciones globulosRojosConFormaDefectuosa) {
		this.globulosRojosConFormaDefectuosa = globulosRojosConFormaDefectuosa;
	}


	public EnfermedadesPreexistentesOpciones getAcumulacionExcesivaDeHierro() {
		return acumulacionExcesivaDeHierro;
	}


	public void setAcumulacionExcesivaDeHierro(EnfermedadesPreexistentesOpciones acumulacionExcesivaDeHierro) {
		this.acumulacionExcesivaDeHierro = acumulacionExcesivaDeHierro;
	}


	public EnfermedadesPreexistentesOpciones getDeficitHereditarioDeHemoglobina() {
		return deficitHereditarioDeHemoglobina;
	}


	public void setDeficitHereditarioDeHemoglobina(EnfermedadesPreexistentesOpciones deficitHereditarioDeHemoglobina) {
		this.deficitHereditarioDeHemoglobina = deficitHereditarioDeHemoglobina;
	}


	public OrigenPatologia getOrigen() {
		return origen;
	}

	public void setOrigen(OrigenPatologia origen) {
		this.origen = origen;
	}


}
