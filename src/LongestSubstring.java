public class LongestSubstring {

    public int lengthOfLongestSubstring(String string){

        int stringLength = string.length();
        int res = 0;



        for (int i = 0; i < stringLength; i++) {

            boolean[] occurred = new boolean[256];

            for (int j = i; j < string.length(); j++) {
                if(occurred[string.charAt(j)]){
                    break;
                }
                res = Math.max(res,j-i+1);
                occurred[string.charAt(j)] = true;
            }
            occurred[string.charAt(i)] = false;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] stringArray = {"abcabcbb", "bbbbb", "pwwkew"};
        LongestSubstring substring = new LongestSubstring();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(substring.lengthOfLongestSubstring(stringArray[i]));
        }
    }
}
