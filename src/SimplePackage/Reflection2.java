package SimplePackage;

public class Reflection2 {

	public static void main(String[] args) {
		Simple obj2 = new Simple();
		obj2.squareA();
//		s.squareB();
		double num1 = obj2.var1;
//		double num2 = s.num2;
		System.out.println("obj2=" + obj2);
	}


}
