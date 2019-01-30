
class A{
	int a;

	void throwException(){
		System.out.println("Inside class A");
		throw new ArithmeticException();
	}
}

	class B extends A{
		int b;
		void throwException(){
			System.out.println("Inside class B");
			throw new ArithmeticException();
		}

		void overridethrow(){
			System.out.println("Inside class B");
			super.throwException();
		}
	}

class C extends B{
	int c;
	void throwException(){
		System.out.println("In class C");
		throw new ArithmeticException();
	}
	void overridethrow(){
		System.out.println("Inside class C");
		super.throwException();
	}
}

class Hierchy{
	public static void main(String[] args) {
		try{
		//A a = new A();
		//a.throwException();

		B b = new B();
		System.out.println("Throwing Exception in B");
		b.throwException();
		System.out.println("Overriding Exception in B");
		b.overridethrow();

		C c = new C();
		System.out.println("Throwing Exception in C");
		c.throwException();
		System.out.println("Overriding Exception in C");
		c.throwException();
}

catch(ArithmeticException e){
	System.out.println("In Exception");
	}
}
}
