// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int N = Integer.parseInt(args[0]);
		double sum = 1;
		boolean t = true;
		double num = 3;

		for (int i = 1; i < N; i++){
			if (t == true){
				sum = sum - (1/num);
				t = false;
			}
			else {
				sum = sum + (1/num);
				t = true;
			}
			num = num + 2;
		}
		System.out.println("Pi according to Java: " + Math.PI);

		System.out.println("Pi, approximated: " + (sum * 4));

		}
}
