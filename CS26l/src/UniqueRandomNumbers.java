
public class UniqueRandomNumbers {
   public static void main(final String[] args) throws Exception {
		System.out.println((int) (Math.random() * 1000000000));

		/*
		 * Below code will generate random number
		 * between 10 and 50. ((int)
		 * (Math.random()*(maximum - minimum))) +
		 * minimum
		 * 
		 * This is simple tweak which is used
		 * here. First we generate random number
		 * between 0 and (maximum - minimum)(40 in
		 * current scenario) and then adding
		 * minimum number after random number gets
		 * generated.
		 * 
		 */
   }
}
