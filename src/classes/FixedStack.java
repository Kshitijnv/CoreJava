package classes;

public class FixedStack implements Stack {
	
	Customer []stack;
	int counter;
	
	public FixedStack() {
		stack = new Customer[STACK_SIZE];
		counter = 0;
	}
	
	@Override
	public void push(Customer cust) {
		if(counter<stack.length) {
			stack[counter] = cust;
			counter++;
		}
		else {
			System.out.println("Stack is full");
		}
	}
		@Override
		public void pop() {
//			if(counter!=0) {
//				if(counter==Stack.STACK_SIZE)
//	}
			if(counter>STACK_SIZE)	//stack_size = 5
				stack[--counter]=null;
			else if(counter<STACK_SIZE && counter>=0)
				stack[counter--]=null;
			else
				System.out.println("Stack is underflow!!! Nothing to pop");
			for(Customer f : stack) {
				if(f!=null)
					System.out.println(f);
			}
		}
	
	
}
