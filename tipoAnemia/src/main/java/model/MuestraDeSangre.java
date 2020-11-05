package model;

import model.enums.NivelComponente;

public class MuestraDeSangre {
	public Double hematocrito;
	public NivelComponente nivelHematocrito;
	public Double hemoglobinaCorspucularMedia;
	public NivelComponente nivelHemoglobinaCorpuscularMedia;
	public Double volumenCorpuscularMedio;
	public NivelComponente nivelVolumenCorpuscularMedio;
	public Double sideremia;
	public NivelComponente nivelSideremia;
	public Double transferrina;
	public NivelComponente nivelTransferrina;
	public Double ferritina;
	public NivelComponente nivelFerritina;
	public Double amplitudDistribucionEritrocitaria;
	public NivelComponente nivelAmplitudDistribucionEritrocitaria;
	public Double reticulocitos;
	public NivelComponente nivelReticulocitos;
	public Double hematies;
	public NivelComponente nivelHematies;
	public Double vitaminaB12;
	public NivelComponente nivelVitaminaB12;	
	public Double folato;
	public NivelComponente nivelFolato;
	
	public MuestraDeSangre() {
		super();
		this.nivelHematocrito = NivelComponente.NoDeterminado;
		this.nivelHemoglobinaCorpuscularMedia = NivelComponente.NoDeterminado;
		this.nivelVolumenCorpuscularMedio = NivelComponente.NoDeterminado;
		this.nivelSideremia = NivelComponente.NoDeterminado;
		this.nivelTransferrina = NivelComponente.NoDeterminado;
		this.nivelAmplitudDistribucionEritrocitaria = NivelComponente.NoDeterminado;
		this.nivelReticulocitos = NivelComponente.NoDeterminado;
		this.nivelHematies = NivelComponente.NoDeterminado;
		this.nivelFerritina = NivelComponente.NoDeterminado;
		this.nivelVitaminaB12 = NivelComponente.NoDeterminado;
		this.nivelFolato = NivelComponente.NoDeterminado;
	}

	public Double getHematocrito() {
		return hematocrito;
	}

	public void setHematocrito(Double hematocrito) {
		this.hematocrito = hematocrito;
	}

	public NivelComponente getNivelHematocrito() {
		return nivelHematocrito;
	}

	public void setNivelHematocrito(NivelComponente nivelHematocrito) {
		this.nivelHematocrito = nivelHematocrito;
	}

	public Double getHemoglobinaCorspucularMedia() {
		return hemoglobinaCorspucularMedia;
	}

	public void setHemoglobinaCorspucularMedia(Double hemoglobinaCorspucularMedia) {
		this.hemoglobinaCorspucularMedia = hemoglobinaCorspucularMedia;
	}

	public NivelComponente getNivelHemoglobinaCorpusculasMedia() {
		return nivelHemoglobinaCorpuscularMedia;
	}

	public void setNivelHemoglobinaCorpusculasMedia(NivelComponente nivelHemoglobinaCorpusculasMedia) {
		this.nivelHemoglobinaCorpuscularMedia = nivelHemoglobinaCorpusculasMedia;
	}

	public Double getVolumenCorpuscularMedio() {
		return volumenCorpuscularMedio;
	}

	public void setVolumenCorpuscularMedio(Double volumenCorpuscularMedio) {

		this.volumenCorpuscularMedio = volumenCorpuscularMedio;
	}

	public NivelComponente getNivelVolumenCorpuscularMedio() {
		return nivelVolumenCorpuscularMedio;
	}

	public void setNivelVolumenCorpuscularMedio(NivelComponente nivelVolumenCorpuscularMedio) {
		this.nivelVolumenCorpuscularMedio = nivelVolumenCorpuscularMedio;
	}

	public Double getSideremia() {
		return sideremia;
	}

	public void setSideremia(Double sideremia) {
		this.sideremia = sideremia;
	}

	public NivelComponente getNivelSideremia() {
		return nivelSideremia;
	}

	public void setNivelSideremia(NivelComponente nivelSideremia) {
		this.nivelSideremia = nivelSideremia;
	}

	public Double getTransferrina() {
		return transferrina;
	}

	public void setTransferrina(Double transferrina) {
		this.transferrina = transferrina;
	}

	public NivelComponente getNivelTransferrina() {
		return nivelTransferrina;
	}

	public void setNivelTransferrina(NivelComponente nivelTransferrina) {
		this.nivelTransferrina = nivelTransferrina;
	}

	public Double getFerritina() {
		return ferritina;
	}

	public void setFerritina(Double ferritina) {
		this.ferritina = ferritina;
	}

	public NivelComponente getNivelFerritina() {
		return nivelFerritina;
	}

	public void setNivelFerritina(NivelComponente nivelFerritina) {
		this.nivelFerritina = nivelFerritina;
	}

	public Double getAmplitudDistribucionEritrocitaria() {
		return amplitudDistribucionEritrocitaria;
	}

	public void setAmplitudDistribucionEritrocitaria(Double amplitudDistribucionEritrocitaria) {
		this.amplitudDistribucionEritrocitaria = amplitudDistribucionEritrocitaria;
	}

	public NivelComponente getNivelAmplitudDistribucionEritrocitaria() {
		return nivelAmplitudDistribucionEritrocitaria;
	}

	public void setNivelAmplitudDistribucionEritrocitaria(NivelComponente nivelAmplitudDistribucionEritrocitaria) {
		this.nivelAmplitudDistribucionEritrocitaria = nivelAmplitudDistribucionEritrocitaria;
	}

	public Double getReticulocitos() {
		return reticulocitos;
	}

	public void setReticulocitos(Double reticulocitos) {
		this.reticulocitos = reticulocitos;
	}

	public NivelComponente getNivelReticulocitos() {
		return nivelReticulocitos;
	}

	public void setNivelReticulocitos(NivelComponente nivelReticulocitos) {
		this.nivelReticulocitos = nivelReticulocitos;
	}

	public Double getHematies() {
		return hematies;
	}

	public void setHematies(Double hematies) {
		this.hematies = hematies;
	}

	public NivelComponente getNivelHematies() {
		return nivelHematies;
	}

	public void setNivelHematies(NivelComponente nivelHematies) {
		this.nivelHematies = nivelHematies;
	}

	public Double getVitaminaB12() {
		return vitaminaB12;
	}

	public void setVitaminaB12(Double vitaminaB12) {
		this.vitaminaB12 = vitaminaB12;
	}

	public NivelComponente getNivelVitaminaB12() {
		return nivelVitaminaB12;
	}

	public void setNivelVitaminaB12(NivelComponente nivelVitaminaB12) {
		this.nivelVitaminaB12 = nivelVitaminaB12;
	}

	public Double getFolato() {
		return folato;
	}

	public void setFolato(Double folato) {
		this.folato = folato;
	}

	public NivelComponente getNivelFolato() {
		return nivelFolato;
	}

	public void setNivelFolato(NivelComponente nivelFolato) {
		this.nivelFolato = nivelFolato;
	}

	@Override
	public String toString() {
		return "MuestraDeSangre [hematocrito=" + hematocrito + ", nivelHematocrito=" + nivelHematocrito
				+ ", hemoglobinaCorspucularMedia=" + hemoglobinaCorspucularMedia + ", nivelHemoglobinaCorpusculasMedia="
				+ nivelHemoglobinaCorpuscularMedia + ", volumenCorpuscularMedio=" + volumenCorpuscularMedio
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
