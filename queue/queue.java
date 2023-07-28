package queue;


class queue
 {
	private int[] arr;
	private int rear, front;
	
	public queue(int size) 
                       {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isFull() 
                      {
		return rear == arr.length - 1;
	}


	public boolean isEmpty() 
                      {
		return rear == front;
	}

	public void push(int val) 
                        {
		if(isFull())
			throw new RuntimeException("Queue is Full.");
		rear++;
		arr[rear] = val;
	}


	public void pop() 
                       {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty.");
		front++;
	}

	public int peek() 
                      {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty.");
		return arr[front + 1];
	}
                       

        public void display()
           {
               for(int i=front+1;i<=rear;i++)
               {
            	   System.out.println(arr[i]);
               }
               
           }
}