package model.enums;

public enum AnemiaTypes {
	NoDeterminado, Sideroblastica, Megaloblastica, DeEnfermedadesCronicas, DeCelulasFalciformes, Hemolitica, Aplasica, Ferropenica,
	Talasemia;

	public Boolean isa(AnemiaTypes tipo) {

		return this.toString() == tipo.toString();

	}
}
