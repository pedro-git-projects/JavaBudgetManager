package model;

public enum Frequency {
	ONETIME("one time"),
	RECURRING("recurring");	

	private String string;

	Frequency(String name){string = name;}

	@Override
	public String toString() {
		return string;
	}
}
