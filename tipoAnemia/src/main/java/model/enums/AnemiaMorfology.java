package model.enums;

public enum AnemiaMorfology {
	NoDeterminado, Microcitica, Normocitica, Macrocitica;
	
	
	public Boolean isa(AnemiaMorfology morfologia) {
		
		return this.toString() == morfologia.toString();
		
	}
}
