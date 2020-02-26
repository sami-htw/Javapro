import java.util.StringTokenizer;

public class StringTockeneizerEx {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("My name is Osama Ahmad");
        StringTokenizer st2 = new StringTokenizer("My ,name ,is ,Osama ,Ahmad");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            //  System.out.println(st2.nextToken(","));
        }
        System.out.println("The next Token is:" + st2.nextToken(","));
    }
}

