public class code7 {
    public static void main(String[] args) {
        String s = "Java   is   very powerful";
        String[] words = s.trim().split("\\s+");

        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) result += " ";
        }
        System.out.println(result);
    }
}
   
