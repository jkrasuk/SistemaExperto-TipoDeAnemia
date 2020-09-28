package model.enums;

public enum OriginType {
	DeficienciaDeHierro, DeficienciaDeVitaminaB12, DeficienciaDeFolatos, TrastornoInmunitario, Cancer,
	InfeccionesProlongadas, EnfermedadDrepanocítica, RasgoDrepanocítico, VelocidadDeRegeneracionDeGlobulosRojosBaja,
	EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos, Hemocromatosis, GenDeProduccionDeHemoglobinaDefectuoso;

	public Boolean isa(OriginType option) {

		return this.toString() == option.toString();

	}
}
