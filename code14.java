public class code14
{
    public static void main(String[] args) {
        String s = "Java is extremely powerful";
        String[] words = s.split(" ");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
        System.out.println("Length: " + longest.length());
    }
}
