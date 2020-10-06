package model.enums;

public enum AnemiaTypes {
	NoDeterminado, AnemiaSideroblastica, AnemiaMegaloblastica, AnemiaDeEnfermedadesCronicas, AnemiaDeCelulasFalciformes, AnemiaHemolitica, AnemiaAplasica,
	AnemiaFerropenica, Talasemia;

	public Boolean isa(AnemiaTypes tipo) {

		return this.toString() == tipo.toString();

	}
}
