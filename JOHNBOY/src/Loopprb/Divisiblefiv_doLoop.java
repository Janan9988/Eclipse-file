package Loopprb;

public class Divisiblefiv_doLoop {
	    public static void main(String[] args) {
	        int i = 100;
	        int j = 500;

	        System.out.println("Numbers divisible by 5 between 100 and 500:");

	        do {
	            if (i % 5 == 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= j);
	    }
	
}

	/*public static void main(String[] args) {
int i = 100;
int j = 500;

do {
	if(i %5 == 0 ) { 

	System.out.println("The numbers are divisible by 5 is  : "+i);
	i++;
	}
}
	while(i <= j);

	}

}
*/