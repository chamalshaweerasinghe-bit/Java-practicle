public class Car{
	int year;
	String brand;
	double price;
	
	public Car (){
	     year = 2000;
		 brand = "unknow";
		 price =0.00;
	}
	
	public void displayInfo(){
		System.out.println("year:" + year);
		System.out.println("Brand:" + brand);
		System.out.println("Price:" + price);
	}
	
}