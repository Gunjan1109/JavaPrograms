class complex{
		private int real;
		int imaginary;
		//Non - parametrized constructor
		complex(){}
		//parametrized constructor
		complex(int real, int imaginary){
			this.real = real;
			this.imaginary = imaginary;
		}

		/*complex add (complex c){
			complex cadd = new complex();
			cadd.real = real + c.real;
			cadd.imaginary = imaginary + c.imaginary;
			return cadd;
		}*/
		int getReal(){
			return real;
		}
		void setReal(int r){
			real =  r;
		}
}

class ComplexDemoStatic{
	public static void main(String[] args) {
		complex c1 = new complex(1,2);
		complex c2 = new complex(3,7);
		complex c3 = new complex();
		c3 = add(c1,c2);
		System.out.println("c1 = "+ c1.getReal() + " "+ c1.imaginary);
		System.out.println("c2 = "+ c2.getReal() + " "+ c2.imaginary);
		System.out.println("Sum = " + c3.getReal() + " "+ c3.imaginary);
	}

	public static complex add(complex c1, complex c2){
		complex c3 = new complex();
		int r = c1.getReal() + c2.getReal();
		c3.setReal(r);
		c3.imaginary = c1.imaginary + c2.imaginary;
		return c3;
	}
}