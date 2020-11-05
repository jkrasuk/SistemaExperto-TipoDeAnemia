package model;

import model.enums.MorfologiasAnemia;
import model.enums.TiposAnemia;

public class TipoAnemia {
	public TiposAnemia diagnostico;
	public MorfologiasAnemia morfologia;

	public TipoAnemia() {
		super();
		this.diagnostico = TiposAnemia.NoDeterminado;
		this.morfologia = MorfologiasAnemia.NoDeterminado;
	}

	public MorfologiasAnemia getMorfologia() {
		return morfologia;
	}

	public void setMorfologia(MorfologiasAnemia morfologia) {
		this.morfologia = morfologia;
	}

	public TiposAnemia getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(TiposAnemia diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "TipoAnemia [diagnostico=" + diagnostico + ", morfologia=" + morfologia + "]";
	}

}
