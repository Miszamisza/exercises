import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.regex.Pattern;

public class
ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");

        return (boolean) pattern.matcher(phoneNumber).matches();
    }
}
