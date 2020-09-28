package model.enums;

public enum BloodComponentType {
	Numerico;

	public Boolean isa(BloodComponentType tipo) {

		return this.toString() == tipo.toString();

	}
}
