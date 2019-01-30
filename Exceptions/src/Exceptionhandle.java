class ExceptionExample{
	int i;
	ExceptionExample(int i){
		this.i = i;
	}
	void display(){
		System.out.println(" i = " + i);
	}
}

class Exceptionhandle{
	public static void main(String[] args) {
		try{
		ExceptionExample e=null;
		e.display();
	}

	catch(NullPointerException e){
		System.out.println(e.toString());
	}
	}
}