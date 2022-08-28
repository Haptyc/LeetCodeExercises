package august2022;

public class IntegersReversed {
    public static int reversed(int value){
        int remainder;
        int reversed = 0;
        while (value != 0){
            remainder = value %10;
            reversed = (reversed * 10) + remainder;
            value /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] intArray = {123, -123, 120};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(reversed(intArray[i]));
        }
    }
}
