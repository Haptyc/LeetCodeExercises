public class RomanNumerals {

    public static int getValue(char numeral){
        switch (numeral){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }


    public static int romanToInt(String num){

        int res = 0;

        for (int i = 0; i < num.length(); i++) {
            int character = getValue(num.charAt(i));

            if(i+1 < num.length()){
                int character1 = getValue(num.charAt(i+1));

                if(character >= character1){
                    res += character;
                }else{
                    res = res + character1 - character;
                    i++;
                }
            }else{
                res += character;
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
