package model.enums;

public enum OriginType {
	DeficienciaDeHierro, DeficienciaDeVitaminaB12, DeficienciaDeFolatos, TrastornoInmunitario, Cancer,
	InfeccionesProlongadas, EnfermedadDrepanoc�tica, RasgoDrepanoc�tico, VelocidadDeRegeneracionDeGlobulosRojosBaja,
	EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos, Hemocromatosis, GenDeProduccionDeHemoglobinaDefectuoso;

	public Boolean isa(OriginType option) {

		return this.toString() == option.toString();

	}
}
