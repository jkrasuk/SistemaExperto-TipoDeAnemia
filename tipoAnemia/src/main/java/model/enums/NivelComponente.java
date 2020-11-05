package model.enums;

public enum NivelComponente {
	NoDeterminado, Bajo, Normal, Alto;

	public Boolean isa(NivelComponente level) {
		return this.toString() == level.toString();
	}

}
