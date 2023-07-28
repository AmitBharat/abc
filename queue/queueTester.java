package queue;

import java.util.Scanner;

public class queueTester
{
	public static void main(String[] args) 
                                          
	{
		Scanner sc = new Scanner(System.in);
		queue q = new queue(6);
		int choice, val;
		do
       {
			System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. display\nEnter choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: // push
				
					System.out.print("Enter value to push: ");
					val = sc.nextInt();
					q.push(val);
				
				break;
			case 2: // pop
				
					val = q.peek();
					q.pop();
					System.out.println("Popped: " + val);
				
				break;
			case 3: // peek
				
					val = q.peek();
					System.out.println("Peek: " + val);
					break;
					
			case 4://display
				
				q.display();
			
				break;
		}
          
	}
		 while(choice != 0);
		sc.close();
}
}
