package model.enums;

public enum OriginType {
	TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanocítica, RasgoDrepanocítico,
	GenDeProduccionDeHemoglobinaDefectuoso;

	public Boolean isa(OriginType option) {

		return this.toString() == option.toString();

	}
}
