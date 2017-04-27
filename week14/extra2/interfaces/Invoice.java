public class Invoice implements Payable {
	
	private double pricePerItem;
	private int quantity;
	private String partName;
	private String partDescription;
	
	public Invoice(String partName, String partDescription, 
		int quantity, double pricePerItem) {
		
		this.partDescription = partDescription;
		this.partName = partName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}
	
	
	@Override
	public String toString() {
		return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
			"invoice", "part number", partName, partDescription,
			"quantity", quantity, "price per item", pricePerItem);
	}
	
} 
