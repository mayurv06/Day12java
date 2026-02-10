import java.util.Arrays;

public class code11{
    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");
    }
}
