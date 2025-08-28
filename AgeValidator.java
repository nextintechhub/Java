
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }}
class AgeValidator {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting.");
        } else {
            System.out.println("Age is valid.");
        }}
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }}}
