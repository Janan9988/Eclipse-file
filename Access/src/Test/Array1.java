package Test;

public class Array1 {


	public static void main(String[] args) {
		
		   int[][] sum = {
		            {1, 2, 3, 4, 5},
		            {1, 2, 3, 4, 5},
		            {1, 2, 3, 4, 5}
		        };

		        int total = 0 ;

		        
		        for (int i = 0; i < sum.length; i++) {
		            for (int j = 0; j < sum[i].length; j++) {
		                total += sum[i][j];
		                System.out.println("Element at position [" + i + "][" + j + "] = " + sum[i][j]);
		            }
		        }

		        System.out.println("The total value of sum is " + total);
		    }
		}






