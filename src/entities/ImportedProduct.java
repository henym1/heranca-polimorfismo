package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return this.price + this.customsFee;
	}
	
	@Override
	public final String priceTag() {
		return this.name + " $ " + String.format("%.2f", totalPrice()) + 
				" (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")";
	}
	
}
