package model;

import model.enums.OrigenPatologiasOpciones;

public class OrigenPatologia {
	public OrigenPatologiasOpciones
			trastornoInmunitario, cancer, infeccionesProlongadas, enfermedadDrepanocitica, rasgoDrepanocitico,
			genDeProduccionDeHemoglobinaDefectuoso;


	public OrigenPatologiasOpciones getTrastornoInmunitario() {
		return trastornoInmunitario;
	}

	public void setTrastornoInmunitario(OrigenPatologiasOpciones trastornoInmunitario) {
		this.trastornoInmunitario = trastornoInmunitario;
	}

	public OrigenPatologiasOpciones getCancer() {
		return cancer;
	}

	public void setCancer(OrigenPatologiasOpciones cancer) {
		this.cancer = cancer;
	}

	public OrigenPatologiasOpciones getInfeccionesProlongadas() {
		return infeccionesProlongadas;
	}

	public void setInfeccionesProlongadas(OrigenPatologiasOpciones infeccionesProlongadas) {
		this.infeccionesProlongadas = infeccionesProlongadas;
	}

	public OrigenPatologiasOpciones getEnfermedadDrepanocitica() {
		return enfermedadDrepanocitica;
	}

	public void setEnfermedadDrepanocitica(OrigenPatologiasOpciones enfermedadDrepanocitica) {
		this.enfermedadDrepanocitica = enfermedadDrepanocitica;
	}

	public OrigenPatologiasOpciones getRasgoDrepanocitico() {
		return rasgoDrepanocitico;
	}

	public void setRasgoDrepanocitico(OrigenPatologiasOpciones rasgoDrepanocitico) {
		this.rasgoDrepanocitico = rasgoDrepanocitico;
	}

	public OrigenPatologiasOpciones getGenDeProduccionDeHemoglobinaDefectuoso() {
		return genDeProduccionDeHemoglobinaDefectuoso;
	}

	public void setGenDeProduccionDeHemoglobinaDefectuoso(OrigenPatologiasOpciones genDeProduccionDeHemoglobinaDefectuoso) {
		this.genDeProduccionDeHemoglobinaDefectuoso = genDeProduccionDeHemoglobinaDefectuoso;
	}

	

}
