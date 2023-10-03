package Test;

public class StaticAndNonStatic {

		static  int count = 1;

		public  void method() {
			System.out.println(count);
			count++;
		}

		public static void main(String[] args) {

			for(int i=0;i<10;i++) {
				StaticAndNonStatic s=new StaticAndNonStatic();
				s.method();
			}
		}

	}