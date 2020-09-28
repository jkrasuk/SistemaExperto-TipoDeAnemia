package model;

public class Persona {
	private MuestraDeSangre muestraDeSangre;
	private EnfermedadPreexistente enfermedadPreexistente;

	public EnfermedadPreexistente getEnfermedadPreexistente() {
		return enfermedadPreexistente;
	}

	public void setEnfermedadPreexistente(EnfermedadPreexistente enfermedadPreexistente) {
		this.enfermedadPreexistente = enfermedadPreexistente;
	}

	public MuestraDeSangre getMuestraDeSangre() {
		return muestraDeSangre;
	}

	public void setMuestraDeSangre(MuestraDeSangre muestraDeSangre) {
		this.muestraDeSangre = muestraDeSangre;
	}

}
