package clascPackage;

import classPackageOne.TestOne;

public class SimpleTesting {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.add(10, 20);
		int result = Test.sum; // accessing variable
		System.out.println("sum = " + result);
		TestOne to = new TestOne();
		to.sub(20, 10);
		int resultSub = TestOne.sub;
		System.out.println("sub = " + resultSub);
	}
	
	

}