package model;

import java.math.BigInteger;
import java.util.UUID;

public class Bill {
	private final UUID uuid;
	public String title;
	public BigInteger cost;
	public Frequency frequency;
	public Status status;

	public Bill(String title, BigInteger cost, Frequency frequency, Status status) {
		this.uuid = UUID.randomUUID(); 
		this.title = title;
		this.cost = cost;
		this.frequency = frequency;
		this.status = status;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	@Override
	public String toString() {
		String uuid = this.uuid.toString();
		
		return 
			"UUID: " + uuid + "\n" +
			"Title: " + this.title + "\n" +
			"Cost: " + this.cost.toString() + "\n" +
			"Frequency: " + this.frequency.toString() + "\n" +
			"Status: " + this.status.toString() + "\n";
	}
}
