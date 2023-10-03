package Test;
class NonStatic {
	
	int count;
	public void method() {
		System.out.println(count);
		count++;
		}

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			NonStatic s = new NonStatic ();
			s.method();
		}
		
	}

}
