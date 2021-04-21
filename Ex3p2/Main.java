package Ex3p2;

public class Main {

	public static void main(String[] args) {
		PressureCooker objPressCook = new PressureCooker();
		Philips objPhilips = new Philips("Philips", "RED", "HD2139", 239.80,500.20);
		
		System.out.println("Pressure Cooker Information");
		System.out.print("------------------------------");
		System.out.println(objPressCook);
		System.out.println("Price after discount (10%): RM "+ objPressCook.calDiscount());
		
		System.out.println("\n\nPhilips Pressure Cooker Information");
		System.out.print("------------------------------");
		System.out.println(objPhilips);
		System.out.println("Price after discount (10%): RM "+ objPhilips.calDiscount());
		System.out.println("Balance: RM "+ objPhilips.balance());
	}

}

