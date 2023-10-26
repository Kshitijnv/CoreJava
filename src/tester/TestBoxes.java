package tester;

import java.util.Scanner;

import classes.Boxes;

public class TestBoxes {

	public static void main(String[] args) {
		//Different pkg , non subclass
//	boxes b1 = new boxes(20,3,5);
	System.out.println("How many boxes");
	Scanner sc = new Scanner(System.in);	//4
	//creating reference type of array named b 
	Boxes b[] = new Boxes[sc.nextInt()];	//b[4]..b[0],b[1],b[2],b[3]	..reference type of array
	System.out.println(b);	//[Lbox.boxes@hexcode
	System.out.println(b.getClass());
	
	//Display default value of boxes
	System.out.println("Before Initialization");
	for(Boxes newBox: b)	//  boxes newBox=b 
	{		
		System.out.println("Array using foreach Loop  ");
		System.out.println(newBox);
	}
	
	for(int i=0; i< b.length;i++) {
		System.out.println("Enter the box dimensions : width height depth ");
		 b[i] = new Boxes(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
	System.out.println("After Initialization");
	for(Boxes newBox: b)	//  boxes newBox=b 
	{
		System.out.println(newBox.getBoxDetails());
	}
	for(int i=0;i<b.length;i++) {
		if(b[i].getBoxVolume()>100)
			b[i].setBoxWidth();
	}
	System.out.println("After checking conditon of volume>100");
	for(Boxes newBox: b)	//  boxes newBox=b 
	{
		System.out.println(newBox.getBoxDetails());
	}
	sc.close();
	}
}
