package model.enums;

public enum OrigenPatologiasOpciones {
	Si, No;

	public Boolean isa(OrigenPatologiasOpciones option) {

		return this.toString() == option.toString();

	}
}
