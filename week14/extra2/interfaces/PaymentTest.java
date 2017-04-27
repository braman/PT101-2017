public class PaymentTest {
	
	
	public static void main(String args[]) {
		
		Payable[] payments = new Payable[6];
		
		
		
		payments[0] = new SalariedEmployee("John", "Smith", "123-465", 1000);
		
		payments[1] = new HourlyEmployee("Tom", "Cruz", "123-222", 80_000, 1);
		
		payments[2] = new CommissionEmployee("Waren", "Buffet", "123-333", 
			1_000_000_000, 0.99);
		
		payments[3] = new BasePlusCommissionEmployee("Steve", "Jobs", "123-444", 
			100_000_000, 0.1, 250_000);

		payments[4] = new Invoice("Puma 123", "Nice snickers", 1, 27_000);
		payments[5] = new Invoice("Pico", "Sweet juice", 1, 200);
		
		for (Payable p: payments) {
			System.out.printf("%s \nPayment due $%,.2f\n\n", p, p.getPaymentAmount());
		}
		
		
	}
	
} 
