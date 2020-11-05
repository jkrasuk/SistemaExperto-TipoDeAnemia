package model.enums;

public enum MorfologiasAnemia {
	NoDeterminado, Microcitica, Normocitica, Macrocitica;

	public Boolean isa(MorfologiasAnemia morfologia) {

		return this.toString() == morfologia.toString();

	}
}
