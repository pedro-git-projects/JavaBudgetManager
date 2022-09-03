package model;

public enum Status {
	PAID("paid"), 
	PENDING("pending"),
	OVERDUE("overdue");	

	private String string;
	Status(String name){string = name;}

	@Override
	public String toString() {
		return string;
	}
}
