public class code12{
    public static void main(String[] args) {
        String s = "swiss";
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        char result = 0;
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                result = c;
                break;
            }
        }

        System.out.println(result == 0 ? "None" : result);
    }
}
