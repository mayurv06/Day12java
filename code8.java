public class code8 {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        s = s.replaceAll("\\s+", "").toLowerCase();

        int i = 0, j = s.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++; j--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
