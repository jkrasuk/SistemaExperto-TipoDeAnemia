package model;

import model.enums.ExistingDiseases;

public class EnfermedadPreexistente {
	private ExistingDiseases enfermedad;
	private OrigenPatologia origen;

	public OrigenPatologia getOrigen() {
		return origen;
	}

	public void setOrigen(OrigenPatologia origen) {
		this.origen = origen;
	}

	public ExistingDiseases getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(ExistingDiseases enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String toString() {
		return "EnfermedadPreexistente [enfermedad=" + enfermedad + ", origen=" + origen + "]";
	}

}
