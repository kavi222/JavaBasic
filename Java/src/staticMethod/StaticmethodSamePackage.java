package staticMethod;

public class StaticmethodSamePackage {
	public static String static_variable_differentClass_samePackage = "static variable from different class and same package";
	
	public String instance_variable_differentClass_samePackage = "instance variable from different class and same package";
	public static void differentClassMethod() {
		System.out.println("different class static method");
	}
	public void instanceVariableFromDifferentClassMethod() {
		System.out.println("different class instance method");
	}

}
