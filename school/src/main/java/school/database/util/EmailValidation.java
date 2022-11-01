package school.database.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile("(([a-z]|[A-Z]|[0-9])+)(@)(.+)(\\.)(([a-z]|[A-Z]){3})");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.matches();
		return matchFound;
	}
	
	public static void main(String args[]) {
		String email = "asdg630jdf@xcbk.ifm";
		System.out.println(isValidEmail(email));
	}
}
