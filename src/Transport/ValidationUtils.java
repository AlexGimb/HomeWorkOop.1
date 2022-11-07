package Transport;

public class ValidationUtils {
    public static String Validation(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
}