import java.util.Arrays;
public class Week3CodingAsignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an int array, subtracting values, calculating average
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93,72};
		int lengthOfAges = ages.length;
		int difference = Math.abs(ages[lengthOfAges - lengthOfAges] - ages[lengthOfAges - 1]);
			System.out.println("Difference: " + difference);
		int sumOfNums = 0;
		for(int age : ages ) {
			sumOfNums += age;  
		  }
		int averageNums = sumOfNums / ages.length;
			System.out.println("Average: " + averageNums);
		
		//Creating a string array, calculating average number of letters per name, concatenate names
		String[] names =  {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; {
		int sumOfLetters = 0;
		for(int i = 0; i < names.length; i++) {
			sumOfLetters += names[i].length();
			}
			int averageLetters = sumOfLetters / names.length;
				System.out.println("Average Number of Letters per Name: " + averageLetters);			
	}
		//Add length of each name
		int [] nameLengths = new int[names.length]; {
		for (int i = 0; i< names.length; i++) {
				nameLengths[i] = names[i].length();				
			}
		int sum = 0;
		for(int i = 0; i < nameLengths.length; i++){
					sum += nameLengths [i];
				}
					System.out.println("Total letters in all names: " + sum);
				}
		
		//Calling methods from below
		double[] decimals = {3.1, 9.4, 23.6, 64.4, 2.2, 8.9, 28.7, 93.7, 72.4};
		double[] decimals2 = {5.1, 6.4, 4.6, 87.4, 8.2, 8.9, 28.7, 93.7, 72.4};
		
		double[] savings = {20.4, 5.9, 77.8, 56.73, 345.60, 123.99 ,7.66, 8.65, 6.98, 56.45, 184.6, 434.8};
			
			System.out.println(concatenatedWord("Hello!", 5));
			System.out.println(fullName("Full Name: " + "Shawntel", "Gallegos"));
			System.out.println("Verify if number is greater than 100: " + iSSumOfArrayGreaterThanNum(ages));
			System.out.println("Average of all Elements: " + averageOfAllElements(decimals));
			System.out.println("Differece of decimal Elements: " + differenceOfElements(decimals, decimals2));
			System.out.println("Will buy a drink: " + willBuyDrink(true, 9.00));
			System.out.println("can go on Vacation: " + canGoOnVacation(savings, true));
		
	}
	public static String concatenatedWord(String word, int n) {
		String concatenatedWord = "";
		for(int i = 0; i < n; i++) {
			concatenatedWord += word;
		}
		return concatenatedWord;
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static boolean iSSumOfArrayGreaterThanNum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum > 100;
	}
	public static double averageOfAllElements(double[] arr) {
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		return average;
	}
	public static boolean differenceOfElements(double[] arr1, double[] arr2) {
		double sum = 0.0;
		double sum1 = 0.0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			sum1 += arr2[i];
			}
		double average = sum / arr1.length;
		double average1 = sum1 / arr2.length;
		return average > average1;
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	public static boolean canGoOnVacation(double[] Savings, boolean isSummer) {
		double savings = 0;
		for(int i = 0; Savings.length > 1000; i++) {
			savings += Savings.length;
			}
			if(savings > 1000 && isSummer == true);
			return true;
	}
}


 




		



