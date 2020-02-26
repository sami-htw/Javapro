import java.util.StringTokenizer;

public class StringTockeneizerEx {
    public static void main(String[] args) {
        //creating StringTokenizer
        StringTokenizer st = new StringTokenizer("Hello,everyone,in,Java,community", ",");

        //counting the Tokens
        System.out.println("The number of tokens:" + st.countTokens());

        //checking for any tokens
        System.out.println(st.hasMoreElements());

        while (st.hasMoreElements()) {
            System.out.println("The next token Output: " + st.nextElement());
        }

        String splitString = "first,second,third,fourth,fifth";

        System.out.println("\n split Example: \n");
        String[] tokens = splitString.split(",");
        // int tokencount = tokens.length;
        for (int i = 0; i < tokens.length; i++) {
            System.out.println("split output: " + tokens[i]);
        }
    }
}

