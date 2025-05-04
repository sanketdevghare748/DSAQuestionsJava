package InterviewQues;

public class MultipleInheritanceEx {
	
	interface A {
		public void show();
	}
	
	interface B {
		public void show();
	}
	
	interface C extends A,B {
		public void showAB();
	}
	
	public class D implements C
	{

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void showAB() {
			// TODO Auto-generated method stub
			A a= new D();
		}
		
	}
}

