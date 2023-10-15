package classes;

public class GrowableStack implements Stack {
	Customer[] stack;
	Customer[] stack2;
	int counter;

	public GrowableStack() {
		stack = new Customer[STACK_SIZE];
		stack2 = new Customer[STACK_SIZE*2];
		counter = 0;
	}
	public void push(Customer cust) {
	if(counter<STACK_SIZE) {

		if (counter < stack.length && counter >= 0) {
			stack[counter++] = cust;
		} else {
			stack[counter++] = cust;
		}
	}
	else
	{
		for(int i = 0 ;i<STACK_SIZE;i++) {
			stack2[i]=stack[i];
		}
		if (counter < stack.length && counter >= 0) {
			stack2[counter++] = cust;
		} else {
			stack2[counter++] = cust;
		}
	}
		
	}

	@Override
	public void pop() {
		for (Customer f : stack) {
			if (f != null)
				System.out.println(f.toString());
		}
		if (counter > STACK_SIZE)
			stack[--counter] = null;
		else if (counter < STACK_SIZE && counter > 0)
			stack[counter--] = null;
		else
			System.out.println("Stack is underflow!!! Nothing to pop");
	
	}
}
