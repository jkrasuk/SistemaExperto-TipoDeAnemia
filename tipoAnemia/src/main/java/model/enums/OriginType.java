package model.enums;

public enum OriginType {
	TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanoc�tica, RasgoDrepanoc�tico,
	GenDeProduccionDeHemoglobinaDefectuoso;

	public Boolean isa(OriginType option) {

		return this.toString() == option.toString();

	}
}
