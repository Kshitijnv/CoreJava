package tester;

import java.util.Scanner;

import classes.Point2D;

public class TestPoint2d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many points do you want to plot? ");
		int numPoints = scanner.nextInt();
		Point2D[] pointsArray = new Point2D[numPoints];

		int choice;
		do {
			System.out.println("Options\n1. Plot a point\n2. Display all points\n3. Compare points\n0. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the array index, x coordinate, and y coordinate: ");
				int index = scanner.nextInt();
				double x = scanner.nextDouble();
				double y = scanner.nextDouble();
				if (index < 0 || index >= numPoints) {
					System.out.println("Error: Invalid index.");
				} else if (pointsArray[index] != null) {
					System.out.println("Error: A point is already plotted at this index.");
				} else {
					pointsArray[index] = new Point2D(x, y);
					System.out.println("Point plotted successfully.");
				}
				break;
			case 2:
				System.out.println("All plotted points: ");
				for (Point2D point : pointsArray) {
					if (point != null) {
						System.out.println(point.show());
					}
				}
				break;
			case 3:
				System.out.print("Enter the first index: ");
				int index1 = scanner.nextInt();
				System.out.print("Enter the second index: ");
				int index2 = scanner.nextInt();
				if (index1 < 0 || index1 >= numPoints || index2 < 0 || index2 >= numPoints) {
					System.out.println("Error: Invalid indices.");
				} else {
					if (pointsArray[index1] == null || pointsArray[index2] == null) {
						System.out.println("Error: One or both points are not plotted.");
					} else {
						if (pointsArray[index1].isEqual(pointsArray[index2])) {
							System.out.println("SAME");
						} else {
							double distance = pointsArray[index1].calcDist(pointsArray[index2]);
							System.out.println("DIFFERENT");
							System.out.println("Distance between the points: " + distance);
						}
					}
				}
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);

		scanner.close();
	}
}
