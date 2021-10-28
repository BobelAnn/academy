package by.academy.classwork.lesson3;

public class Product {
	String name;
	double cost;
	int size;
	
	public Product () {
		super ();
	}

	public Product (String name) {
		super ();
		this.name = name;
	}
	
	public Product (String name, double cost) {
		super ();
		this.name = name;
		this.cost = cost;
	}
	
	public Product (String name, double cost, int size) {
		super ();
		this.name = name;
		this.cost = cost;
		this.size = size;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	public void setCost (double cost) {
		this.cost = cost;
	}
	
	public double getCost () {
		return cost;
	}
	
	public void setSize (int size) {
		this.size = size;
	}
	
	public int getSize () {
		return size;
		}
	
	public void work() {
		System.out.println(name + " ��������");
	}
	
	public void charge() {
		System.out.println("������� ����������");
	}
	
	public void sleep() {
		System.out.println("������� ��������");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}
			
}
