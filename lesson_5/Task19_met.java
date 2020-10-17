public class Task19_met {

    public static void main(String[] args) {

        String str = " how    many words in this line  ";

        String[] words = str.trim().split(" +");

        System.out.println(words.length);
    }
}