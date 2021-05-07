package registerSystem.core.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private static final String regex= "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	static int count=0;
	public static boolean isValid(String email) {
		
		Pattern pattern=java.util.regex.Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
}
//"^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";