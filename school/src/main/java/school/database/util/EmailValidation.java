package school.database.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile("(([a-z]|[A-Z]|[0-9])+)(@)(.+)(\\.)(([a-z]|[A-Z]){3})");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.matches();
		return matchFound;
	}

	public boolean isValidPhoneNumber(String number) {
		if (number == null || number.equals("")) {
			return false;
		}

		int numDigits = 0;
		for (int i = 0; i < number.length(); i++) {
			if (Character.isDigit(number.charAt(i))) {
				numDigits++;
			}
		}
		if (numDigits != 9)
			return false;

		for (int i = 0; i < number.length(); i++) {
			if (!Character.isDigit(number.charAt(i)) && number.charAt(i) != '-' && number.charAt(i) != '.'
					&& number.charAt(i) != ' ')
				return false;
		}

		if (number.substring(0, 3).equals("555"))
			return false;

		return true;
	}

}
