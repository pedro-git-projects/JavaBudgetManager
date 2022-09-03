import java.math.BigInteger;

import model.Bill;
import model.BudgetManager;
import model.Status;
import model.Frequency;

public class Main {
	public static void main(String[] args) {
		Bill bill = new Bill("BJJ", new BigInteger("190"), Frequency.RECURRING, Status.PENDING);
		Bill bill1 = new Bill("IESB", new BigInteger("400"), Frequency.RECURRING, Status.PENDING);
		Bill bill2 = new Bill("Internet", new BigInteger("140"), Frequency.RECURRING, Status.PENDING);

		BudgetManager budget = new BudgetManager(new BigInteger("1500"), bill, bill1, bill2);
		System.out.println(budget);
	}
}
