package staticVariable;

import different.staticvariable.VariableFromDifferentPackage;

public class StaticVariable {
	
    //access modifier datatype variablename = ;
	// datatype variablename = somevalue;
	static int i;
	static String staticVariableWithoutAccessModifier = "hello without access modifier";
	public static String staticVariable = "hello";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // call variable from same class	
		System.out.println(i);
		System.out.println(staticVariableWithoutAccessModifier);
      System.out.println(staticVariable);
      // call variable from different class - classname.variablename
      System.out.println(StaticVariableDifferentClass.staticVariableDifferentClass);
      /* call variable from different package
       * 1. By importing the package and call classname.variablename
       * 2. call variable by packagename.classname.variable 
       */
       
      System.out.println(VariableFromDifferentPackage.differentVariablePackage);
      System.out.println(different.staticvariable.VariableFromDifferentPackage.differentVariablePackage);
      
	}

}
