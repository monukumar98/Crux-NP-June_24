package Lec34;

public abstract class Abstract_Class_Demo {

	public abstract void fun();

	public abstract int fun1();

	public boolean isempty() {
		return true;
	}
	public static void main(String[] args) {
		Abstract_Class_Demo ab = new Abstract_Class_Demo() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int fun1() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
	}
}
