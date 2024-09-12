package hwOopOneTwo;

public class Product {
	
	private String name;
	private String discription;
	private double price;
	private double weight;
	
	public Product(String name, String discription, double price, double weight) {
		super();
		this.name = name;
		this.discription = discription;
		this.price = price;
		this.weight = weight;
	}
	
	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double waight) {
		this.weight = waight;
	}

	public String toString() {
		return "Product : [ name = " + name + ", discription = " + discription +  ", price = " + price + "$, weight = " + weight +"kg ] ";
	}
	
	
	
	
	
}
