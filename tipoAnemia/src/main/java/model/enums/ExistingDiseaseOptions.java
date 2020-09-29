package model.enums;

public enum ExistingDiseaseOptions {
	Si, No;

	public Boolean isa(ExistingDiseaseOptions option) {

		return this.toString() == option.toString();

	}
}
