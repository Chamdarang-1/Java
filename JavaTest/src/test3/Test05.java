package test3;

 class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	// 왜 public Vehicle일까..
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
		
	}

}

 class Vehicle {
	
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	public void info() {
		System.out.println("---------------");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
	}

}

public class Test05 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}

}
