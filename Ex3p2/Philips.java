package Ex3p2;

public class Philips extends PressureCooker {//Philips (child/Subclass) extends means as inheret data and method from PressureCooker (Parent/Super class)
	
	private double payment;
	
	public Philips(String b, String c, String m, double p, double py) {
		
		super(b,c,m,p); //super=parent(PressureCooker)
		
		payment = py;
	}
	
	public double getPayment() {
		return payment;
	}
	
	public double balance() {
		return payment - super.calDiscount() ;
	}
	
	public String toString() {
		return super.toString() + "\nPayment: RM " + payment ;
	}
}
