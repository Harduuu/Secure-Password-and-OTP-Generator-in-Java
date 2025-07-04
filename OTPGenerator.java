import java.security.SecureRandom;

public class OTPGenerator {
    private static final String DIGITS = "0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String generateOTP(int length) {
        if (length <= 0) throw new IllegalArgumentException("OTP length must be positive");

        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otp.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }
        return otp.toString();
    }
}