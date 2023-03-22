package differentStaticMethod;

public class StaticmethodDifferentPackage {
	public static String static_variable_differentClass_differentPackage = "static variable from different class and package";
	public static String instance_variable_differentClass_differentPackage = "instance variable from different class and package";
	public static void methodFromDifferentPackage() {
		System.out.println("static method from different package");
	}
	public void instanceMethodFromDifferentPackage() {
		System.out.println("Instance method from different package");
	}

}
