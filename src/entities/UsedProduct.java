package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date manufactureDate() {
		return this.manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		return this.name + " (used) $ " + String.format("%.2f", this.price) + 
				" (Manufacture date: " + sdf.format(this.manufactureDate) + ")";
				
	}
}
