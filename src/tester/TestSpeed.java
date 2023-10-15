package tester;

import java.text.ParseException;
import java.util.Scanner;
import classes.VehicleValidationRules;
import custom_exceptions.LicenseIsExpired;
import custom_exceptions.SpeedOutOfRange;

public class TestSpeed {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
System.out.println("Welcome to traffic management system");
			System.out.println("Enter the current speed: ");
			VehicleValidationRules.validateVehicle(sc.nextInt());
			
			System.out.println("Enter the expiry date of your DL in dd-mm-yyyy format");
			VehicleValidationRules.validateLicense(sc.next());
		} catch (SpeedOutOfRange e) {
			e.printStackTrace();
		}
		catch (LicenseIsExpired e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exiting the program!!!!");
	}

}
