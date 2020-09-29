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
	private TipoAnemia tipoAnemia;

	public TipoAnemia getTipoAnemia() {
		return tipoAnemia;
	}

	public void setTipoAnemia(TipoAnemia tipoAnemia) {
		this.tipoAnemia = tipoAnemia;
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
		System.out.println(nivelVolumenCorpuscularMedio);
		System.out.println("ACA");
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
				+ hematies + ", nivelHematies=" + nivelHematies + ", tipoAnemia=" + tipoAnemia + "]";
	}
	
	

}
