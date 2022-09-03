package model;

import java.util.ArrayList;

public class BillList {
	public ArrayList<Bill> bills;

	BillList(Bill... bills) {
		this.bills = new ArrayList<Bill>();
		for(int i = 0; i < bills.length; i++) {
			this.bills.add(i, bills[i]);
		}
	}

	public void addBill(Bill bill) {
		this.bills.add(bill);
	}

	public void removeBill(Bill bill) {
		for(int i = 0; i < this.bills.size(); i++) {
			if(this.bills.get(i).getUUID() == bill.getUUID()) {
				this.bills.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder billsStr = new StringBuilder();
		for(int i = 0; i < this.bills.size(); i++) {
				billsStr.append(this.bills.get(i).toString());
				billsStr.append("\n");
		}	
		return billsStr.toString();
	}
}
