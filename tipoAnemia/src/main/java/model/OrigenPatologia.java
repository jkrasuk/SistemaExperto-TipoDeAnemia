package model;

import model.enums.PatologyOriginOptions;

public class OrigenPatologia {
	private PatologyOriginOptions DeficienciaDeHierro, DeficienciaDeVitaminaB12, DeficienciaDeFolatos,
			TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanoc�tica, RasgoDrepanoc�tico,
			VelocidadDeRegeneracionDeGlobulosRojosBaja, EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos, Hemocromatosis,
			GenDeProduccionDeHemoglobinaDefectuoso;

	public PatologyOriginOptions getDeficienciaDeHierro() {
		return DeficienciaDeHierro;
	}

	public void setDeficienciaDeHierro(PatologyOriginOptions deficienciaDeHierro) {
		DeficienciaDeHierro = deficienciaDeHierro;
	}

	public PatologyOriginOptions getDeficienciaDeVitaminaB12() {
		return DeficienciaDeVitaminaB12;
	}

	public void setDeficienciaDeVitaminaB12(PatologyOriginOptions deficienciaDeVitaminaB12) {
		DeficienciaDeVitaminaB12 = deficienciaDeVitaminaB12;
	}

	public PatologyOriginOptions getDeficienciaDeFolatos() {
		return DeficienciaDeFolatos;
	}

	public void setDeficienciaDeFolatos(PatologyOriginOptions deficienciaDeFolatos) {
		DeficienciaDeFolatos = deficienciaDeFolatos;
	}

	public PatologyOriginOptions getTrastornoInmunitario() {
		return TrastornoInmunitario;
	}

	public void setTrastornoInmunitario(PatologyOriginOptions trastornoInmunitario) {
		TrastornoInmunitario = trastornoInmunitario;
	}

	public PatologyOriginOptions getCancer() {
		return Cancer;
	}

	public void setCancer(PatologyOriginOptions cancer) {
		Cancer = cancer;
	}

	public PatologyOriginOptions getInfeccionesProlongadas() {
		return InfeccionesProlongadas;
	}

	public void setInfeccionesProlongadas(PatologyOriginOptions infeccionesProlongadas) {
		InfeccionesProlongadas = infeccionesProlongadas;
	}

	public PatologyOriginOptions getEnfermedadDrepanoc�tica() {
		return EnfermedadDrepanoc�tica;
	}

	public void setEnfermedadDrepanoc�tica(PatologyOriginOptions enfermedadDrepanoc�tica) {
		EnfermedadDrepanoc�tica = enfermedadDrepanoc�tica;
	}

	public PatologyOriginOptions getRasgoDrepanoc�tico() {
		return RasgoDrepanoc�tico;
	}

	public void setRasgoDrepanoc�tico(PatologyOriginOptions rasgoDrepanoc�tico) {
		RasgoDrepanoc�tico = rasgoDrepanoc�tico;
	}

	public PatologyOriginOptions getVelocidadDeRegeneracionDeGlobulosRojosBaja() {
		return VelocidadDeRegeneracionDeGlobulosRojosBaja;
	}

	public void setVelocidadDeRegeneracionDeGlobulosRojosBaja(
			PatologyOriginOptions velocidadDeRegeneracionDeGlobulosRojosBaja) {
		VelocidadDeRegeneracionDeGlobulosRojosBaja = velocidadDeRegeneracionDeGlobulosRojosBaja;
	}

	public PatologyOriginOptions getEnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos() {
		return EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos;
	}

	public void setEnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos(
			PatologyOriginOptions enfermedadDeMedulaOseaAsociadaAlosGlobulosRojos) {
		EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos = enfermedadDeMedulaOseaAsociadaAlosGlobulosRojos;
	}

	public PatologyOriginOptions getHemocromatosis() {
		return Hemocromatosis;
	}

	public void setHemocromatosis(PatologyOriginOptions hemocromatosis) {
		Hemocromatosis = hemocromatosis;
	}

	public PatologyOriginOptions getGenDeProduccionDeHemoglobinaDefectuoso() {
		return GenDeProduccionDeHemoglobinaDefectuoso;
	}

	public void setGenDeProduccionDeHemoglobinaDefectuoso(
			PatologyOriginOptions genDeProduccionDeHemoglobinaDefectuoso) {
		GenDeProduccionDeHemoglobinaDefectuoso = genDeProduccionDeHemoglobinaDefectuoso;
	}

	@Override
	public String toString() {
		return "OrigenPatologia [DeficienciaDeHierro=" + DeficienciaDeHierro + ", DeficienciaDeVitaminaB12="
				+ DeficienciaDeVitaminaB12 + ", DeficienciaDeFolatos=" + DeficienciaDeFolatos
				+ ", TrastornoInmunitario=" + TrastornoInmunitario + ", Cancer=" + Cancer + ", InfeccionesProlongadas="
				+ InfeccionesProlongadas + ", EnfermedadDrepanoc�tica=" + EnfermedadDrepanoc�tica
				+ ", RasgoDrepanoc�tico=" + RasgoDrepanoc�tico + ", VelocidadDeRegeneracionDeGlobulosRojosBaja="
				+ VelocidadDeRegeneracionDeGlobulosRojosBaja + ", EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos="
				+ EnfermedadDeMedulaOseaAsociadaAlosGlobulosRojos + ", Hemocromatosis=" + Hemocromatosis
				+ ", GenDeProduccionDeHemoglobinaDefectuoso=" + GenDeProduccionDeHemoglobinaDefectuoso + "]";
	}

}
