package staticMethod;

public class Staticmethod {

	public static String static_variable_sameclass = "static variable from same class";
	public String instance_variable_sameclass = "instance variable from same class";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// local variable
		String static_variable_sameclass = "Local variable from same class";
		// accessing same class method inside same class
		sameClassMethod();
		// accessing different class method from different class
		StaticmethodSamePackage.differentClassMethod();
		// accessing different class method from different class from different package
		differentStaticMethod.StaticmethodDifferentPackage.methodFromDifferentPackage();
		// accessing the local variable when local and static variable name are similar
		System.out.println("variable to be printed is from local : " + static_variable_sameclass);
		// accessing the global variable when local and static variable name are similar
		System.out.println("variable to be printed is from Global : " + Staticmethod.static_variable_sameclass);
		// accessing static variable from different class
		System.out.println(StaticmethodSamePackage.static_variable_differentClass_samePackage);
		// accessing static variable from different class from different package
		System.out.println(
				differentStaticMethod.StaticmethodDifferentPackage.static_variable_differentClass_differentPackage);
		System.out.println("******************");
		Staticmethod staticInstanceMethod = new Staticmethod();
		System.out.println(staticInstanceMethod.instance_variable_sameclass);
		staticInstanceMethod.instance_same_class_method();
		System.out.println("******************");
		StaticmethodSamePackage instanceMethodFrmDiffClass = new StaticmethodSamePackage();
		instanceMethodFrmDiffClass.instanceVariableFromDifferentClassMethod();
		System.out.println(instanceMethodFrmDiffClass.instance_variable_differentClass_samePackage);
		System.out.println("******************");
		
		differentStaticMethod.StaticmethodDifferentPackage instanceMethodFrmDiffClassDiffPackage = new differentStaticMethod.StaticmethodDifferentPackage();
		instanceMethodFrmDiffClassDiffPackage.instanceMethodFromDifferentPackage();
		System.out.println(instanceMethodFrmDiffClassDiffPackage.instance_variable_differentClass_differentPackage);
		//System.out.println(instance_variable_sameclass);
		//instance_same_class_method();
		
	}

	public static void sameClassMethod() {
		System.out.println("Same class method");
		System.out.println("Same class method calling same same class variable : " + static_variable_sameclass);

	}
	
	public void instance_same_class_method() {
		System.out.println("instance method : "+instance_variable_sameclass);
		
	}

}
