package tester;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number of fruits u want to buy");
			Fruit f[] = new Fruit[sc.nextInt()];
			int key, count = 0;
			do {
				System.out.println(
						"Choose a fruit"
						+ "\n1)Add Apple 2)Add Mango 3)Add Orange "
						+ "\n4)Display the names of fruits in basket "
						+ "\n5)Display name,color,weight&taste of fruit in the basket"
						+ "\n6)Mark a fruit as stale "
						+ "\n7)Mark all sour fruit stale "
						+ "\n8)Check Functionality of a fruit "
						+ "\n9)EXIT");
				key = sc.nextInt();

				switch (key) {
				case 1:
					System.out.println("How many kilos apples you want to add ");
					f[count++] = new Apple(sc.nextDouble());
					break;
				case 2:
					System.out.println("How many kilos Mango you want to add ");
					f[count++] = new Mango(sc.nextDouble());
					break;
				case 3:
					System.out.println("How many kilos Orange you want to add ");
					f[count++] = new Orange(sc.nextDouble());
					break;
				case 4:
					for (Fruit i : f) {
						if (i != null && !i.hasStale())
							System.out.println(i.getName());
					}
					break;
				case 5:
					for (Fruit i : f) {
						if (i != null && !i.hasStale())
							System.out.println(i);
					}
					break;
				case 6:
					System.out.println("Enter the position of selected fruit");
					int index = sc.nextInt()-1;
					f[index--].setStale();
					System.out.println("Removed from the basket successfully!!");
					break;
				case 7:
					for (int i = 0; i < f.length; i++) {
						if (f[i] instanceof Apple || f[i] instanceof Orange)
							f[i].setStale();
					}
					System.out.println("Removed from the basket successfully!!");
					break;
				case 8:
					System.out.println("Enter the position of selected fruit");
					index = sc.nextInt()-1;
					if(f[index]!=null) {
						if(f[index] instanceof Apple)
							((Apple)f[index]).jam();
						else if(f[index] instanceof Orange)
							((Orange)f[index]).juice();
						else 
							((Mango)f[index]).pulp();	
					}
					else
						System.out.println("No fruit is added at this point");
					index--;
					break;
				case 9:
						System.out.println("!!!!!EXITING!!!!!!");
						break;
				default:
					System.out.println("INVALID INPUT");
					break;
				}
			} while (key != 9);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exiting the program!!!!!");
	}

}
