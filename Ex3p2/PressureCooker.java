package Ex3p2;

	import java.util.Scanner;

	public class PressureCooker {
		
		Scanner input = new Scanner(System.in);
		
		private String brand;
		private String color;
		private String model;
		private double price;
		
		//Default Constructor
		PressureCooker(){
			
			System.out.print("Enter the brand: ");
			this.brand = input.next();
			
			System.out.print("Enter the color: ");
			this.color = input.next();
			
			System.out.print("Enter the model: ");
			this.model = input.next();
			
			System.out.print("Enter the price: ");
			this.price = input.nextDouble();
				
		}

		//Parameterized Constructor
		PressureCooker(String b, String c, String m, double p){
			this.brand = b;
			this.color = c;
			this.model = m;
			this.price = p;
		}
		
		public String getBrand() {
			return this.brand;
		}
		
		public String getColor() {
			return this.color;
		}
		
		public String getModel() {
			return this.model;
		}
		
		public double getPrice() {
			return this.price;
		}
		
		public double calDiscount() {
			return this.price - this.price * 0.1;
		}
		
		public String toString() {
			return "\nBrand: " + brand + "\nColor: " + color + "\nModel: " + model + "\nPrice: RM " + price;  
		}
}
