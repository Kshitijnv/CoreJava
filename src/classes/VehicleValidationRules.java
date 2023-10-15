package classes;

import custom_exceptions.LicenseIsExpired;
import custom_exceptions.SpeedOutOfRange;

import java.text.ParseException;
import java.util.Date;

public class VehicleValidationRules {
// Declaring static constant variable for miminum & maximum speed
	public static final int MIN_VALUE;
	public static final int MAX_VALUE;
	static {
		MIN_VALUE = 40;
		MAX_VALUE = 80;
	}

// Creating a method to check the speed & throw exception if speed goes out of range.

	public static void validateVehicle(int speed) throws SpeedOutOfRange {
		if (speed < MIN_VALUE)
			throw new SpeedOutOfRange("Speed too slow! Please move to the left lane");
		if (speed > MAX_VALUE)
			throw new SpeedOutOfRange("Speed is too fast!!,please slow down to the safe speed");
		System.out.println("Speed is within range :D, Go Ahead.... ");
	}

// Creating a method to check the license is valid or not.
	public static void validateLicense(String s) throws ParseException, LicenseIsExpired {
		// Converting the license date from string to date type
		Date date = DateFormat.sdf.parse(s);
		// Custom exception handling
		if (date.before(new Date())) {
			throw new LicenseIsExpired("License is expired!, please renew it");
		}
		System.out.println("License is Valid :D ");
	}
}
