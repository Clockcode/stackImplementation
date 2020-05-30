
public class Stack {
	
	private char[] word;
	private int capacity;
	private int top = -1;
	
//	Pushing a char into the array and incrementing top
	public void push(char letter) {
		word[top++] = letter;
	}
//	Decrementing top then returning the char on the top.
	public char pop() {
		return word[--top];
	}
//	Returning the capacity of the array
	public int length() {
		return capacity;
	}
//	Constructor with a capacity identifier 
//	Creating the char array
//	setting top = 0
	Stack(int paramCapacity) {
		word = new char[paramCapacity];
		capacity = paramCapacity;
		top++;
	}
	


}
