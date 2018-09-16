package main;

public class Interface{
	public static void main(String[] args){
		My_Gredding hw = (name) -> "Hello "+name;
		String h = hw.sayHello("Mamun ");
		System.out.println(h);
		My_Gredding hw1 = (name) -> "How are you? \n"+name;
		String h1 = hw1.sayHello("Good after noon");
		System.out.println(h1);
		
		
		
		//NumericTest isEven = (n)->( n% 2) == 0;
		//NumericTest isNegative = (n)->( n<0);
		//System.out.println(isEven.compuTest(5));
		//System.out.println(isNegative.compuTest(-5));
		
	}

}
