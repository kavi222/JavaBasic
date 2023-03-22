package clascPackage;

public class StaticMethodOne {

	public static String staticVariable = "Static variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		StaticMethodTwo.staticMethodTwo();
		//nonStaticMethod();
	}

	public static void staticMethod() {
		System.out.println("calling static variable in same class : " + staticVariable);
	}

	public void nonStaticMethod() {
		System.out.println("calling static variable inside non static method : " + staticVariable);
	}
}
