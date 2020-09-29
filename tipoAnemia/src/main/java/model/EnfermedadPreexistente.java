package model;

import java.util.ArrayList;
import java.util.List;

import model.enums.ExistingDiseases;

public class EnfermedadPreexistente {
	private ExistingDiseases enfermedad;
	private OrigenPatologia origen;
	private List<ExistingDiseases> enfermedades;
	
	public List<ExistingDiseases> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<ExistingDiseases> enfermedades) {
		this.enfermedades = enfermedades;
	}

	public EnfermedadPreexistente() {
		super();
		origen = new OrigenPatologia();
		enfermedades = new ArrayList<ExistingDiseases>();
	}

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

	public void addEnfermedad(ExistingDiseases enfermedad) {
		this.enfermedades.add(enfermedad);
	}
	
	@Override
	public String toString() {
		return "EnfermedadPreexistente [enfermedad=" + enfermedad + ", origen=" + origen + "]";
	}

}
