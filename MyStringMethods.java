package string_methods;

import java.util.Scanner;

/**
 * Analyzes a string and counts the number of uppercase letters, lowercase 
 * letters, and occurrences of a given string and a given character within 
 * the original string.
 * 
 * @author Russell Taylor
 * 
 * ***Based on a provided template. Only modified by author named above.***
 */

public class MyStringMethods {
	
	private String myStr="";
    
	/**
	 * Prompts the user and reads in a String from a Scanner class from the 
	 * keyboard with the nextLine() method and stores it in "myStr"
	 */
	public void readString() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the desired String: ");
		this.myStr = in.nextLine();
		in.close();
    }
	
	/**
	 * Sets the myStr variable to a new value
	 * @param newStr a new String defined in main
	 */
    public void setString(String newStr) {
    	this.myStr = newStr; 
    }
    
	/**
	 * Uses indexOf and returns the number of occurrences of the string "s" 
	 * in "myStr"
	 * @param s a given substring to be found in myStr
	 */
    public int countOccurrences(String s) {
    	int start = 0, index = 0, count = 0;
    	do {
    		index = this.myStr.indexOf(s, start);
    		if (index >= 0) {
    			start = index + 1;
    			count += 1;
    		}
    	}
    	while (index >=0);
    	
    	return count;
    }
    
	/**
	 * Uses indexOf and return the number of occurrences of the character "c" 
	 * in "myStr"
	 * @param s a given character to be found in myStr
	 */
    public int countOccurrences(char c) {
    	int start = 0, index = 0, count = 0;
    	do {
    		index = this.myStr.indexOf(c, start);
    		if (index >= 0) {
    			start = index + 1;
    			count += 1;
    		}
    	}
    	while (index >=0);
    	
    	return count;
    }
    
	/**
	 * Returns the number of upper case letters in "myStr" 
	 * @return the number of upper case letters in "myStr" 
	 */
    int countUpperCaseLetters() {
    	int uppercase = 0;
    	for (int i = 0; i < this.myStr.length(); i++) {
    		if (Character.isUpperCase(this.myStr.charAt(i))) {
				uppercase++;
			}
    	}
    	return uppercase;
    	
    }
    
	/**
	 * Returns the number of lower case letters in "myStr" 
	 * @return the number of lower case letters in "myStr" 
	 */
    int countLowerCaseLetters() {
    	int lowercase = 0;
    	for (int i = 0; i < this.myStr.length(); i++) {
    		if (Character.isLowerCase(this.myStr.charAt(i))) {
				lowercase++;
			}
    	}
    	return lowercase;
    }
    
	/**
	 * Displays myStr and the number of uppercase letters, lowercase letters,
	 * occurrences of the given substring, and occurrences of the given
	 * character found in myStr.
	 * @param s a given substring to be found in myStr 
	 * @param c a given character to be found in myStr
	 */
    public void printCounts(String s, char c) {
    	System.out.println("***************************************"); 
    	System.out.println("Analyzing: myStr=" + myStr); 
    	System.out.println("Number of Upper case letters=" + countUpperCaseLetters());
    	System.out.println("Number of Lower case letters=" + countLowerCaseLetters());
    	System.out.println("Number of " + s + " is " + countOccurrences(s)); 
    	System.out.println("Number of " + c + " is " + countOccurrences(c));
    }
    
	/**
	 * Calls methods to prompt user to enter a string, analyze the string,
	 * display calculated values, and repeat with two additional strings
	 */
    public static void main(String[] args) { 
    	MyStringMethods msm = new MyStringMethods(); 
    	msm.readString();
    	msm.printCounts("big", 'a');
    	msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
    	msm.printCounts("van", 'a');
    	
    	MyStringMethods msm2 = new MyStringMethods(); 
    	msm2.setString("the elephant in the room wouldn't budge"); 
    	msm2.printCounts("the", 'i');
    } 
}

