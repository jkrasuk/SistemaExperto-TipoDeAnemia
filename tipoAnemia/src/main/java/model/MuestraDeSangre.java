package model;

import model.enums.ComponentLevel;

public class MuestraDeSangre {
	private Double hematocrito;
	private ComponentLevel nivelHematocrito;
	private Double hemoglobinaCorspucularMedia;
	private ComponentLevel nivelHemoglobinaCorpusculasMedia;
	private Double volumenCorpuscularMedio;
	private ComponentLevel nivelVolumenCorpuscularMedio;
	private Double sideremia;
	private ComponentLevel nivelSideremia;
	private Double transferrina;
	private ComponentLevel nivelTransferrina;
	private Double ferritina;
	private ComponentLevel nivelFerritina;
	private Double amplitudDistribucionEritrocitaria;
	private ComponentLevel nivelAmplitudDistribucionEritrocitaria;
	private Double reticulocitos;
	private ComponentLevel nivelReticulocitos;
	private Double hematies;
	private ComponentLevel nivelHematies;
	private Double vitaminaB12;
	private ComponentLevel nivelVitaminaB12;	
	private Double folato;
	private ComponentLevel nivelFolato;
	
	public MuestraDeSangre() {
		super();
		this.nivelHematocrito = ComponentLevel.NoDeterminado;
		this.nivelHemoglobinaCorpusculasMedia = ComponentLevel.NoDeterminado;
		this.nivelVolumenCorpuscularMedio = ComponentLevel.NoDeterminado;
		this.nivelSideremia = ComponentLevel.NoDeterminado;
		this.nivelTransferrina = ComponentLevel.NoDeterminado;
		this.nivelAmplitudDistribucionEritrocitaria = ComponentLevel.NoDeterminado;
		this.nivelReticulocitos = ComponentLevel.NoDeterminado;
		this.nivelHematies = ComponentLevel.NoDeterminado;
		this.nivelFerritina = ComponentLevel.NoDeterminado;
		this.nivelVitaminaB12 = ComponentLevel.NoDeterminado;
		this.nivelFolato = ComponentLevel.NoDeterminado;
	}

	public Double getHematocrito() {
		return hematocrito;
	}

	public void setHematocrito(Double hematocrito) {
		this.hematocrito = hematocrito;
	}

	public ComponentLevel getNivelHematocrito() {
		return nivelHematocrito;
	}

	public void setNivelHematocrito(ComponentLevel nivelHematocrito) {
		this.nivelHematocrito = nivelHematocrito;
	}

	public Double getHemoglobinaCorspucularMedia() {
		return hemoglobinaCorspucularMedia;
	}

	public void setHemoglobinaCorspucularMedia(Double hemoglobinaCorspucularMedia) {
		this.hemoglobinaCorspucularMedia = hemoglobinaCorspucularMedia;
	}

	public ComponentLevel getNivelHemoglobinaCorpusculasMedia() {
		return nivelHemoglobinaCorpusculasMedia;
	}

	public void setNivelHemoglobinaCorpusculasMedia(ComponentLevel nivelHemoglobinaCorpusculasMedia) {
		this.nivelHemoglobinaCorpusculasMedia = nivelHemoglobinaCorpusculasMedia;
	}

	public Double getVolumenCorpuscularMedio() {
		return volumenCorpuscularMedio;
	}

	public void setVolumenCorpuscularMedio(Double volumenCorpuscularMedio) {

		this.volumenCorpuscularMedio = volumenCorpuscularMedio;
	}

	public ComponentLevel getNivelVolumenCorpuscularMedio() {
		return nivelVolumenCorpuscularMedio;
	}

	public void setNivelVolumenCorpuscularMedio(ComponentLevel nivelVolumenCorpuscularMedio) {
		this.nivelVolumenCorpuscularMedio = nivelVolumenCorpuscularMedio;
	}

	public Double getSideremia() {
		return sideremia;
	}

	public void setSideremia(Double sideremia) {
		this.sideremia = sideremia;
	}

	public ComponentLevel getNivelSideremia() {
		return nivelSideremia;
	}

	public void setNivelSideremia(ComponentLevel nivelSideremia) {
		this.nivelSideremia = nivelSideremia;
	}

	public Double getTransferrina() {
		return transferrina;
	}

	public void setTransferrina(Double transferrina) {
		this.transferrina = transferrina;
	}

	public ComponentLevel getNivelTransferrina() {
		return nivelTransferrina;
	}

	public void setNivelTransferrina(ComponentLevel nivelTransferrina) {
		this.nivelTransferrina = nivelTransferrina;
	}

	public Double getFerritina() {
		return ferritina;
	}

	public void setFerritina(Double ferritina) {
		this.ferritina = ferritina;
	}

	public ComponentLevel getNivelFerritina() {
		return nivelFerritina;
	}

	public void setNivelFerritina(ComponentLevel nivelFerritina) {
		this.nivelFerritina = nivelFerritina;
	}

	public Double getAmplitudDistribucionEritrocitaria() {
		return amplitudDistribucionEritrocitaria;
	}

	public void setAmplitudDistribucionEritrocitaria(Double amplitudDistribucionEritrocitaria) {
		this.amplitudDistribucionEritrocitaria = amplitudDistribucionEritrocitaria;
	}

	public ComponentLevel getNivelAmplitudDistribucionEritrocitaria() {
		return nivelAmplitudDistribucionEritrocitaria;
	}

	public void setNivelAmplitudDistribucionEritrocitaria(ComponentLevel nivelAmplitudDistribucionEritrocitaria) {
		this.nivelAmplitudDistribucionEritrocitaria = nivelAmplitudDistribucionEritrocitaria;
	}

	public Double getReticulocitos() {
		return reticulocitos;
	}

	public void setReticulocitos(Double reticulocitos) {
		this.reticulocitos = reticulocitos;
	}

	public ComponentLevel getNivelReticulocitos() {
		return nivelReticulocitos;
	}

	public void setNivelReticulocitos(ComponentLevel nivelReticulocitos) {
		this.nivelReticulocitos = nivelReticulocitos;
	}

	public Double getHematies() {
		return hematies;
	}

	public void setHematies(Double hematies) {
		this.hematies = hematies;
	}

	public ComponentLevel getNivelHematies() {
		return nivelHematies;
	}

	public void setNivelHematies(ComponentLevel nivelHematies) {
		this.nivelHematies = nivelHematies;
	}

	public Double getVitaminaB12() {
		return vitaminaB12;
	}

	public void setVitaminaB12(Double vitaminaB12) {
		this.vitaminaB12 = vitaminaB12;
	}

	public ComponentLevel getNivelVitaminaB12() {
		return nivelVitaminaB12;
	}

	public void setNivelVitaminaB12(ComponentLevel nivelVitaminaB12) {
		this.nivelVitaminaB12 = nivelVitaminaB12;
	}

	public Double getFolato() {
		return folato;
	}

	public void setFolato(Double folato) {
		this.folato = folato;
	}

	public ComponentLevel getNivelFolato() {
		return nivelFolato;
	}

	public void setNivelFolato(ComponentLevel nivelFolato) {
		this.nivelFolato = nivelFolato;
	}

	@Override
	public String toString() {
		return "MuestraDeSangre [hematocrito=" + hematocrito + ", nivelHematocrito=" + nivelHematocrito
				+ ", hemoglobinaCorspucularMedia=" + hemoglobinaCorspucularMedia + ", nivelHemoglobinaCorpusculasMedia="
				+ nivelHemoglobinaCorpusculasMedia + ", volumenCorpuscularMedio=" + volumenCorpuscularMedio
				+ ", nivelVolumenCorpuscularMedio=" + nivelVolumenCorpuscularMedio + ", sideremia=" + sideremia
				+ ", nivelSideremia=" + nivelSideremia + ", transferrina=" + transferrina + ", nivelTransferrina="
				+ nivelTransferrina + ", ferritina=" + ferritina + ", nivelFerritina=" + nivelFerritina
				+ ", amplitudDistribucionEritrocitaria=" + amplitudDistribucionEritrocitaria
				+ ", nivelAmplitudDistribucionEritrocitaria=" + nivelAmplitudDistribucionEritrocitaria
				+ ", reticulocitos=" + reticulocitos + ", nivelReticulocitos=" + nivelReticulocitos + ", hematies="
				+ hematies + ", nivelHematies=" + nivelHematies + ", vitaminaB12=" + vitaminaB12 + ", nivelVitaminaB12="
				+ nivelVitaminaB12 + ", folato=" + folato + ", nivelFolato=" + nivelFolato + "]";
	}
	
	
}
