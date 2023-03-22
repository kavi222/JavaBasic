package clascPackage;

import classPackageOne.*;

public class StaticVariable {
	int b;
	static String c;

	public static String demo = "hello from same class";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to access static variable from same class
		int a;
		a=1;
		StaticVariable ins = new StaticVariable();
		System.out.println(ins.b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(demo);
		// to access static variable from different class within same package - classname.variablename
		System.out.println(StaticVariableSamePackage.demo);
		// to access static variable from different class from different package - classname.variablename and import packagename.classname
		System.out.println(StaticVariableDifferentPackage.demo);
	}

}
