package model.enums;

public enum TiposAnemia {
	NoDeterminado, AnemiaSideroblastica, AnemiaMegaloblastica, AnemiaDeEnfermedadesCronicas, AnemiaDeCelulasFalciformes, AnemiaHemolitica, AnemiaAplasica,
	AnemiaFerropenica, Talasemia;

	public Boolean isa(TiposAnemia tipo) {

		return this.toString() == tipo.toString();

	}
}
