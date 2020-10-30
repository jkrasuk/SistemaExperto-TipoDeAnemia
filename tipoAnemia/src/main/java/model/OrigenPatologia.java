package model;

import model.enums.PatologyOriginOptions;

public class OrigenPatologia {
	private PatologyOriginOptions
			TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanocítica, RasgoDrepanocítico,
			GenDeProduccionDeHemoglobinaDefectuoso;

	
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

	public PatologyOriginOptions getEnfermedadDrepanocítica() {
		return EnfermedadDrepanocítica;
	}

	public void setEnfermedadDrepanocítica(PatologyOriginOptions enfermedadDrepanocítica) {
		EnfermedadDrepanocítica = enfermedadDrepanocítica;
	}

	public PatologyOriginOptions getRasgoDrepanocítico() {
		return RasgoDrepanocítico;
	}

	public void setRasgoDrepanocítico(PatologyOriginOptions rasgoDrepanocítico) {
		RasgoDrepanocítico = rasgoDrepanocítico;
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
		return "OrigenPatologia [TrastornoInmunitario=" + TrastornoInmunitario + ", Cancer=" + Cancer
				+ ", InfeccionesProlongadas=" + InfeccionesProlongadas + ", EnfermedadDrepanocítica="
				+ EnfermedadDrepanocítica + ", RasgoDrepanocítico=" + RasgoDrepanocítico
				+ ", GenDeProduccionDeHemoglobinaDefectuoso=" + GenDeProduccionDeHemoglobinaDefectuoso + "]";
	}

}
