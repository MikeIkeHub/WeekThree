package weekthree;

public class Assignment {

	public static void main(String[] args) {
		int[] ages = new int[9]; // can also use {3,9,23,64,2,8,28,93,61} for quicker and cleaner code

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 61;
		
		int i = ages[ages.length-1] - ages[0]; //subtracts last in array to first in array
		System.out.println("last age - first age: " + i);
		
		double total = 0; // variable total for adding each index
		for(int j = 0; j <= ages.length - 1; j++) {
			total = total + ages[j]; // each number gets added to total
		}
		System.out.println("average of ages: " + total/(ages.length));
		
		String names[] = new String[6]; // can also use {"Sam", "Tommy"... etc}
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int nameTotal = 0; // variable nameTotal for adding each index
		for(int j = 0; j <= names.length - 1; j++) {
			nameTotal = nameTotal + names[j].length(); //letters get added
		}
		System.out.println("average of letters in names: " + nameTotal / names.length);
		
		for(String name : names) { //loop that is read as for every 'variable' in names
			System.out.print(name + " ");
		}
		
		System.out.println(""); //Used for cleaner output by putting keeping lines separated

	    int[] nameLengths = new int[names.length];
	    for (int j = 0; j < names.length; j++) {
	        nameLengths[j] = names[j].length();
	    }
	    
	    int sum = 0; // sum variable for name lengths added up together
		for(int j = 0; j <= nameLengths.length - 1; j++) {
			sum = sum + nameLengths[j];
			if(j == nameLengths.length - 1)
			System.out.println("nameLengths sum: " + sum);
		}
		/*
		 * Method Examples Below
		 */
		String c = printHello("Hello", 3);
		System.out.println("printHello method: " + c);
		
		String d = createFullName("Michael", "Minor");
		System.out.println("createFullName method: " + d);
		
		int exampleTrue[] = new int[] {25,25,25,25,1}; //101
		int exampleFalse[] = new int[] {20,20,20,20,20};  //100
		boolean eTrue = greaterNum(exampleTrue);
		boolean eFalse = greaterNum(exampleFalse);
		
		System.out.println("greaterNum Method: " + eTrue + " greaterNum Method: " + eFalse);
		
		double exampleF[] = new double[] {1,2,3,4,5,6,7,8,9,10}; // 55 divided by 10
		double f = getAverage(exampleF);
		
		System.out.println("getAverage method: " + f);
		
		double exampleG1[] = new double[] {1,2,3,4,5,6,7,8,9,10}; //55 / 10 = 5.5
		double exampleG2[] = new double[] {5,5,5,5,5};			  //25 / 5 = 5
		boolean g = vsAverage(exampleG1, exampleG2);
		boolean g2 = vsAverage(exampleG2, exampleG1);
		System.out.println("vsAverage method: " + g + " vsAverage method: " + g2);
		
		boolean isHotOutside = true;
		double moneyInPocket[] = new double[] {10.51};
		
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("willBuyDrink method: " + willBuyDrink);
		
		double findHigh[] = new double[] {1,5,10,20,50,100};
		double myMethod = findHigh(findHigh);
		System.out.println("myMethod: " + myMethod);
	}
	/*
	
	below are methods
	
	*/
	
	
	public static String printHello(String word, int n) { //prints string based on int
		String j = "";
		for(int i = 1; i <= n; i++) {
			j = j + word;
		}
		return j;
	}
	
	public static String createFullName(String x, String y) { //prints Full Name
		return x + " " + y;
	}
	
	public static boolean greaterNum(int[] numbers) { // true or false statement for arrays >100
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
			if(sum > 100) {
				return true;
			}
		}
		return false;
	}

	public static double getAverage(double[] average) { // adds all the numbers in the double array and finds the average
		double sum = 0;
		for (int i = 0; i < average.length; i++) {
			sum = sum + average[i];
		}
		return sum / average.length;
	}
	
	public static boolean vsAverage(double[] average, double[] averageTwo) { // finds the average of two double arrays and returns true if the first average is greater than the second average
		double sum = 0;
		for(int i = 0; i < average.length; i++) {
			sum = sum + average[i];
		}
		double sumTwo = 0;
		for(int j = 0; j < averageTwo.length; j++) {
			sumTwo = sumTwo + averageTwo[j];
		}
		
		if(sum/average.length > sumTwo/averageTwo.length)
			return true;
		return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double[] moneyInPocket) { //returns true if hot outside and moneyInPocket > 10.50
		double sum = 0;
		for(double money : moneyInPocket)
			sum = sum + money;
		if(isHotOutside == true && sum > 10.50)
			return true;
		return false;
	}
	
	// finds the highest number in an array. I made this so you can pay with the highest bill in your possession.
	public static double findHigh(double[] high) {
		double num = 0;
		for(int i = 0; i < high.length; i++) { // cycles through the array
			if(num < high[i]) {				   // if the current number is less than the next number in the array it will prompt the formula
				num = num - num;               // this subtracts the current number to itself to reset it to 0
				num = num + high[i];           // this will add 0 + the current number in the array = new num
			}
		}
		return num; //prints the highest number
	}
}
