public class AddBinary {
    public String addBinary(String a, String b) {

        int length = Math.max(a.length(), b.length());
        char newStr[] = new char[length];
        boolean carry = false;

        for (int i = length - 1; i >= 0; i--) {
            int aIndex = a.length() - 1 - (length - 1 - i);
            int bIndex = b.length() - 1 - (length - 1 - i);

            char aChar = (aIndex >= 0) ? a.charAt(aIndex) : '0';
            char bChar = (bIndex >= 0) ? b.charAt(bIndex) : '0';

            Solution1 sol = addCol(aChar, bChar, carry);
            newStr[i] = sol.digit;
            carry = sol.carry;
            System.out.println(newStr[i]);
        }

        StringBuilder sb = new StringBuilder();
        ;
        for (int i = newStr.length - 1; i >= 0; i++) {
            sb.append(newStr[i]);
        }

        if (carry)
            sb.append('1');

        return sb.toString();

    }

    public Solution1 addCol(char a, char b, boolean carry) {
        if (a == '0' && b == '0') {
            return new Solution1(!carry ? '0' : '1', false);
        } else if (a == '1' && b == '0') {
            return new Solution1(!carry ? '1' : '0', !carry ? false : true);
        } else if (a == '0' && b == '1') {
            return new Solution1(!carry ? '1' : '0', !carry ? false : true);
        } else if (a == '1' && b == '1') {
            return new Solution1(!carry ? '0' : '1', true);
        }
        return null;
    }

    public class Solution1 {
        char digit;
        boolean carry;

        public Solution1(char digit, boolean carry) {
            this.digit = digit;
            this.carry = carry;
        }
    }
}
