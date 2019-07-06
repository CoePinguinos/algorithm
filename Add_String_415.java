class Add_String_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int d1 = i >= 0 ? num1.charAt(i--) - '0': 0;
            int d2 = j >= 0 ? num2.charAt(j--) - '0': 0;
            int digit = (d1 + d2 + carry) % 10;
            carry = (d1 + d2 + carry) / 10;
            sb.append(digit);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}