package Lec19;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naan";
	}

	public static int Count_Palindrom(String str) {
		int odd = 0;
		// odd lenght ke total Palindromic subString count kr rahe hai
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) != str.charAt(axis + orbit)) {
					break;
				}
				odd++;

			}
		}
		int even = 0;
		// even lenght ke total Palindromic subString count kr rahe hai
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) != str.charAt((int) (axis + orbit))) {
					break;
				}
				even++;
				
			}
		}
		return odd+even;

	}

}
