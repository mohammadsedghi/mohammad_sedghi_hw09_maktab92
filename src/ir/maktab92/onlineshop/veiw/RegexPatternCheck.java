package ir.maktab92.onlineshop.veiw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternCheck {
    public boolean checkPhoneNumber(String userPhoneNumber) {
        String phoneNumberRegexPattern = "^(\\+\\d{1,2}\\s?)?1?\\-?\\.?\\s?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
        Pattern pattern = Pattern.compile(phoneNumberRegexPattern);
        Matcher matcher = pattern.matcher(userPhoneNumber);
        if (matcher.find()) {
            return true;
        } else return false;
    }

    public boolean checkEmailAddress(String emailAddress) {
        String emailAddressRegexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailAddressRegexPattern);
        Matcher matcher = pattern.matcher(emailAddress);
        if (matcher.find()) {
            return true;
        } else return false;

    }

    public boolean checkPostalCode(String postalCode) {
        String postalCodeRegexPattern = "(?!([089])\\1{4})\\d{5}";
        Pattern pattern = Pattern.compile(postalCodeRegexPattern);
        Matcher matcher = pattern.matcher(postalCode);
        if (matcher.find()) {
            return true;
        } else return false;

    }
}
