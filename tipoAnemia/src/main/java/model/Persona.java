package model;

public class Persona {
	public MuestraDeSangre muestraDeSangre;
	public EnfermedadesPreexistentes enfermedadPreexistente;
	public TipoAnemia tipoAnemia;

	public EnfermedadesPreexistentes getEnfermedadPreexistente() {
		return enfermedadPreexistente;
	}

	public void setEnfermedadPreexistente(EnfermedadesPreexistentes enfermedadPreexistente) {
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
