public class Task20_met {

    public static void main(String[] args) {

        String str = "  match score  animal novell  casino ";
        String result = "";

        String[] words = str.trim().split(" ");

        for(String word: words) {
            if(!word.equals("")) {
                result += word.charAt(word.length() - 1);
            }
        }

        System.out.println(result);
    }
}