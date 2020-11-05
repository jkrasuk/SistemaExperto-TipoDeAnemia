package model.enums;

public enum Origen {
	TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanocitica, RasgoDrepanocitico,
	GenDeProduccionDeHemoglobinaDefectuoso;

	public Boolean isa(Origen option) {

		return this.toString() == option.toString();

	}
}
