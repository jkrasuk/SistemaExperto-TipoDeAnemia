package model.enums;

public enum ComponentLevel {
	Bajo, Normal, Alto;

	public Boolean isa(ComponentLevel level) {
		System.out.println("!");
		System.out.println(level);		System.out.println("!");

		if (level != null) {
			return this.toString() == level.toString();

		}
		return false;
	}
	
}
