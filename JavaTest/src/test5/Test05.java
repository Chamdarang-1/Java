package test5;

class Apple{
	private String country;
	private int price;
	
public Apple (String country, int price) {
	this.country = country;
	this.price = price;
}
}





class Banana { 
	private String country;
	private int price;

public Banana (String country, int price) {
	this.country = country;
	this.price = price;
}
	
}

class Grape { 
	private String country;
	private int price;
	
public Grape (String country, int price) {
	this.country = country;
	this.price = price;
	
}
}

public class Test05 {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}

	public static void showInfo(?? fruit) {
		if(fruit ?? Apple) {
			Apple apple = ??? ;
			System.out.println(apple);
			
		}else if(fruit ?? Banana) {
			Banana banana = ???;
			System.out.println(banana);
			
		}else if(fruit ?? Grape) {
			Grape grape = ???;
			System.out.println(grape);
			
		}
	}
}
