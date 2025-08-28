
class WrapperClasses {
    public static void main(String[] args) {

        String intString = "100";
        String doubleString = "99.99";
        int i = Integer.parseInt(intString);
        double d = Double.parseDouble(doubleString);
        System.out.println("Integer value: " + i);
        System.out.println("Double value: " + d);

        char ch1 = 'z';
        System.out.println("Is '" + ch1 + "' a letter? " + Character.isLetter(ch1));
        char ch2 = '5';
        System.out.println("Is '" + ch2 + "' a digit? " + Character.isDigit(ch2));
    }
}
