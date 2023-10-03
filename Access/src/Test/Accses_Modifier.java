package Test;

public class Accses_Modifier {
	public void publicMethod(){
		System.out.println("Public modifier ");
	}
	private void privateMethod() {
		System.out.println("Protected");
	}
	protected void protectedMethod() {
		System.out.println("Prothected Method ");
	}
	void defaultMethod() {
		System.out.println("Default");
	}

	
	public static void main(String[] args) {
		Accses_Modifier a = new Accses_Modifier();
		a.publicMethod();
		
		
		
	}

}
