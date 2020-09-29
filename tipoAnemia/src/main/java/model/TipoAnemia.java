package model;

import model.enums.AnemiaMorfology;
import model.enums.AnemiaTypes;

public class TipoAnemia {
	private AnemiaTypes diagnostico;
	private AnemiaMorfology morfologia;

	public TipoAnemia() {
		super();
		this.diagnostico = AnemiaTypes.NoDeterminado;
		this.morfologia = AnemiaMorfology.NoDeterminado;
	}

	public AnemiaMorfology getMorfologia() {
		return morfologia;
	}

	public void setMorfologia(AnemiaMorfology morfologia) {
		this.morfologia = morfologia;
	}

	public AnemiaTypes getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(AnemiaTypes diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "TipoAnemia [diagnostico=" + diagnostico + ", morfologia=" + morfologia + "]";
	}

}
