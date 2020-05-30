	
public class Palindrome {

	public static void main(String[] args) {
//		Check if argument(s) have passed otherwise ask for arguments
		if(args.length >= 1) {
			for(String element : args) {
//				Create a stack using its' length to determine "capacity"
				Stack stringStack = new Stack(element.length());
				
//				Pushing element's chars into the stack
				for(int index=0; index <= element.length()-1; index++) { 
					stringStack.push(element.charAt(index));
				}
				
//				Popping the chars into a new element
				String reversedElement = "";
				for(int i=1; i <= element.length(); i++) {
					reversedElement += stringStack.pop();
				}
				
//				Checking if the "element" and "reversedElement" are equal *ignoring case*
				if(element.equalsIgnoreCase(reversedElement)) {
					System.out.println("Hurray! '"+ element +"' is a palindrome word.");
				}else {
					System.out.println("Unfortunetly '"+ element +"' is not a palindrome word.");
				}
				
			}
		}else {
			System.out.println("Please pass an argument after the filename");
		}
	}

}
