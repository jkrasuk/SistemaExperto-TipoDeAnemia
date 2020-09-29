package model.enums;

public enum ComponentLevel {
	NoDeterminado, Bajo, Normal, Alto;

	public Boolean isa(ComponentLevel level) {
		return this.toString() == level.toString();
	}
	
}
