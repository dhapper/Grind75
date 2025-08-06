package easy;
public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        // using string builder instead of concat() each char is wayyy faster
        
        if(s.length() == 0 || s.length() == 1) { return true; }

        // String newStr = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;  i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                // newStr = newStr.concat(Character.toString(s.charAt(i)).toLowerCase());
                sb.append(Character.toString(s.charAt(i)).toLowerCase());
            }
        }
        String newStr = sb.toString();

        System.out.println(newStr);

        for(int i = 0; i < newStr.length()/2; i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)){
                return false;
            }
        }

        return true;

    }
}
