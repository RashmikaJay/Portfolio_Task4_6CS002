package SimplePackage;

public class Simple {
	
	public double var1 = 8.2;
	private double var2 = 2;


public Simple() {
		
	}
	
	public Simple(double a, double b) {
		this.var1 = a;
		this.var2 = b;
	}
	
	public void squareA() {
		this.var1 *= this.var1;
	}
	
	private void squareB() {
		this.var2 *= this.var2;
	}
	
	public double getA() {
		return var1;
	}
	
	private void setA(double a) {
		this.var1 = a;
	}
	
	public double getB() {
		return var2;
	}
	
	public void setB(double b) {
		this.var2 = b;
	}
	
	public String toString() {
		return String.format("(num1:%.2f, num2:%.2f)", var1, var2);
	}

}
