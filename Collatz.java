
public class Collatz {
	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		String VC = args [1];
		String concise = "c";
		int seed = 1;
		boolean veC = true;
		if (VC.equals(concise)) veC = false;
		else veC = true;
		boolean reach = true;

		for (int i = 1; i < num + 1; i++){
			int amount = 1;

			do {
				if (veC) System.out.print(seed + " ");
				amount ++; // counts the amount of times the loop run - it takes to reach 1
				if (seed % 2 == 0){
					seed = seed / 2;
					
				}
				else {
					seed = ( seed * 3 ) + 1;

				}
			} while (seed > 1);

			if (seed == 1) reach = true;
			else {
				reach = false;
				System.out.println("there is a seed that didn't reach 1");
				break;
			}
			if (veC) System.out.println( seed + " (" + amount + ")");
			seed = i + 1;
		}

		if (reach == true){
			System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
		}
	}
}
