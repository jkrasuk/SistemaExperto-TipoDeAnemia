package model;

import model.enums.PatologyOriginOptions;

public class OrigenPatologia {
	private PatologyOriginOptions
			TrastornoInmunitario, Cancer, InfeccionesProlongadas, EnfermedadDrepanoc�tica, RasgoDrepanoc�tico,
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
				+ ", InfeccionesProlongadas=" + InfeccionesProlongadas + ", EnfermedadDrepanoc�tica="
				+ EnfermedadDrepanoc�tica + ", RasgoDrepanoc�tico=" + RasgoDrepanoc�tico
				+ ", GenDeProduccionDeHemoglobinaDefectuoso=" + GenDeProduccionDeHemoglobinaDefectuoso + "]";
	}

}
