package LC_58_Length_Of_Last_Word;

public class MainApp {

    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

        s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

        s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        String words[] = s.trim().split(" ");
        return words[words.length-1].length();
    }

}
