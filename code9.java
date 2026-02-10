public class code9 {
    public static void main(String[] args) {
        String s = "programming";
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c] != 0) {
                System.out.println(c + " -> " + freq[c]);
                freq[c] = 0;
            }
        }
    }
}
