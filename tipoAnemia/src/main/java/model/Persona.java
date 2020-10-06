package model;

public class Persona {
	private MuestraDeSangre muestraDeSangre;
	private EnfermedadPreexistente enfermedadPreexistente;
	private TipoAnemia tipoAnemia;

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


	@Override
	public String toString() {
		return "Persona [muestraDeSangre=" + muestraDeSangre + ", enfermedadPreexistente=" + enfermedadPreexistente
				+ ", tipoAnemia=" + tipoAnemia + ", getEnfermedadPreexistente()=" + getEnfermedadPreexistente()
				+ ", getMuestraDeSangre()=" + getMuestraDeSangre() + ", getTipoAnemia()=" + getTipoAnemia()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public TipoAnemia getTipoAnemia() {
		return tipoAnemia;
	}

	public void setTipoAnemia(TipoAnemia tipoAnemia) {
		this.tipoAnemia = tipoAnemia;
	}

}
