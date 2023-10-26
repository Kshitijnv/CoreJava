package tester;

import java.util.Scanner;

import classes.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the coordinates for the first point:");
	        System.out.print("X coordinate: ");
	        double x1 = sc.nextDouble();
	        System.out.print("Y coordinate: ");
	        double y1 = sc.nextDouble();

	        System.out.println("Enter the coordinates for the second point:");
	        System.out.print("X coordinate: ");
	        double x2 = sc.nextDouble();
	        System.out.print("Y coordinate: ");
	        double y2 = sc.nextDouble();

	        // Creating two Point2D objects
	        Point2D p1 = new Point2D(x1, y1);
	        Point2D p2 = new Point2D(x2, y2);

	        // Displaying coordinates of the points
	        System.out.println("Coordinates of the first point: " + p1.show());
	        System.out.println("Coordinates of the second point: " + p2.show());

	        // Checking if the points are the same or different
	        if (p1.isEqual(p2)) {
	            System.out.println("SAME");
	        } else {
	            System.out.println("DIFFERENT");
	            // Displaying the distance between the two points
	            double distance = p1.calcDist(p2);
	            System.out.println("Distance between the points: " + distance);
	        }

	}

}
