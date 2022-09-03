package model;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BillTest {
    @Test
    public void testToString() {
        Bill bill = new Bill("BJJ", new BigInteger("190"), Frequency.RECURRING, Status.PAID);
        String billStr = bill.toString();
        String uuid = bill.getUUID().toString();
        String title = bill.title;
        String cost = bill.cost.toString();
        String frequency = bill.frequency.toString();
        String status = bill.status.toString();

        String expect ="UUID: " + uuid + "\n" +
                "Title: " + title + "\n" +
                "Cost: " + cost + "\n" +
                "Frequency: " + frequency + "\n" +
                "Status: " + status + "\n";
        assertTrue(billStr.matches(expect), "Expected strings to be equal");
    }
}
