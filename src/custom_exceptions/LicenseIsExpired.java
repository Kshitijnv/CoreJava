package custom_exceptions;

public class LicenseIsExpired extends Exception {
	public LicenseIsExpired(String errMsg){
		super(errMsg);
	}
}
