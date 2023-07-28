package stack;

import java.util.Scanner;

public class stack
{
	
	 
	    int top = -1;
	    int n = 10;
	    int a[] = new int[n];
	    Scanner sc = new Scanner(System.in);

	    void push() {
	        if (top == (n - 1)) {
	            System.out.println("Overflow");
	        } else {
	            System.out.println("Enter Data");
	            int i = sc.nextInt();
	            top = top + 1;
	            a[top] = i;
	            System.out.println("Item inserted");
	        }
	    }

	    void pop() {
	        if (top == -1) {
	            System.out.println("Underflow");
	        } else {
	            top = top - 1;
	            System.out.println("Item deleted");
	        }
	    }

	    void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        System.out.println("Items are: ");
	        for (int j = top; j >= 0; j--) {
	            System.out.println(a[j]);
	        
	    }
	}
}
