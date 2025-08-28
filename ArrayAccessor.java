
class ArrayAccessor {
    public int accessArrayElement(int[] arr, int index) {
        return arr[index];
    }
    public static void main(String[] args) {
        ArrayAccessor accessor = new ArrayAccessor();
        int[] numbers = {10, 20, 30};
        int value = accessor.accessArrayElement(numbers, 5);
        System.out.println("Value at index 5: " + value);
    }}
