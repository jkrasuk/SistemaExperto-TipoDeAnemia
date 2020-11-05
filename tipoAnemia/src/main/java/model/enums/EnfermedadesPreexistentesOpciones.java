package model.enums;

public enum EnfermedadesPreexistentesOpciones {
	Si, No;

	public Boolean isa(EnfermedadesPreexistentesOpciones option) {

		return this.toString() == option.toString();

	}
}
