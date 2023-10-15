package tester;

import java.util.Scanner;

import classes.Customer;
import classes.FixedStack;
import classes.Stack;

public class TesterStack {

	public static void main(String[] args) {
		System.out.println("Choose the type of stack \n1) Fixed Stack \n2)Growable Stack ");
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		Stack fs=null;
		while (flag == false) {
			if (sc.nextInt() == 1) {
				System.out.println("Fixed stack of 10 size is successfully created");
				// Create an array of object
				 fs  = new FixedStack();
				flag = true;
			} else if (sc.nextInt() == 2) {
				System.out.println("Enter the initial size of your stack");
				// Create an array of object
//				Growth [] gs = new Growth(sc.nextInt());
				flag = true;
			}

		}
		do {
			System.out.println("Choose the 3)Push the data \n4)Pop & display the data \n5)EXIT ");
			switch (sc.nextInt()) {
			case 3:
					fs.push(new Customer(1,"Kshitij","pune"));
					fs.push(new Customer(2,"harsh","pune"));
					fs.push(new Customer(3,"arbaj","mumbai"));
					fs.push(new Customer(4,"hrishi","mumbai"));
					fs.push(new Customer(5,"Prasad","nagpur"));
				break;
			case 4:
				fs.pop();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}

		}while(true);
	}

}
