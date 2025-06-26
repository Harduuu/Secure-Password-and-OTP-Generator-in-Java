public class Main {
    public static void main(String[] args) {
        String password = PasswordGenerator.generatePassword(12);
        String otp = OTPGenerator.generateOTP(6);

        System.out.println("Generated Password: " + password);
        System.out.println("Generated OTP: " + otp);
    }
}