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
            if (reversed < Integer.MAX_VALUE){
                return reversed;
            } else{
                return 0;
            }

    }

    public static void main(String[] args) {
        int[] intArray = {123,1234,12345,123456,1234567,12345678};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(reversed(intArray[i]));
        }
        System.out.println(reversed(1534236469));
    }
}
