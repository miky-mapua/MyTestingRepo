package MyPackage;

import java.util.Scanner;

public class MoreJavaTraining {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Input the string: ");
	    String string = input.nextLine();
		//String string = "i'm going to the party today!";
		System.out.println(string);
		int j = 0;
		
		String letters[] = string.split("");
		for (int i = 0; i < letters.length; i++) {
			if ("o".equals(letters[i]) ||
				"u".equals(letters[i]) ||
				"i".equals(letters[i]) ||
				"a".equals(letters[i]) ||
				"e".equals(letters[i]) ){
			j++;
			}
		}
		System.out.println("The number of vowels in above statement = " + j);
	}	
}

/*	public static void main (String[] args){
		
		        Scanner input = new Scanner(System.in);
		        System.out.print("Input the string: ");
		        String str = input.nextLine();

		        System.out.print("Number of Vowels in the string: " + count_Vowels(str)+"\n");
		    } 
		  public static int count_Vowels(String str)
		    {
		        int count = 0;
		        for (int i = 0; i < str.length(); i++)
		        {
		            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
		                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		            {
		                count++;
		            }
		        }
		        return count;
	}
} */