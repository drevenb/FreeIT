public class Task18_met {

    public static void main(String[] args) {

        String str = "Hello! Let's find punctuation marks, then... we will count them all. Are you ready?";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            char symbol = str.charAt(i);

            if(symbol == ',' || symbol == '.' || symbol == '!' || symbol == ':' ||
                symbol == ';' || symbol == '?' || symbol == '-' || symbol == '"' ||
                symbol == '(' || symbol == ')') {

                count++;
            }
        }

        System.out.println(count);
    }
}