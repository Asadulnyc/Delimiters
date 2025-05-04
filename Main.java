import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] tokens = { "(", "x+yadah", ")", "*5" };
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));

        String open = "<sup>";
        String close = "</sup>";

        Delimiters d1 = new Delimiters(open, close);

        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = { open, open, close, open, close, close };
        for (String s : delims) {
            delimiters.add(s);
        }

        System.out.println(d1.isBalanced(delimiters));
    }
}