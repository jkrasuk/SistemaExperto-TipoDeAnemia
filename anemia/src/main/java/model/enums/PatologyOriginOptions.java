package model.enums;

public enum PatologyOriginOptions {
	Si, No;

	public Boolean isa(PatologyOriginOptions option) {

		return this.toString() == option.toString();

	}
}
