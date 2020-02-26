import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadCommandsFromConsole {
    public static void main(String[] args) {
        ReadCommandsFromConsole obj = new ReadCommandsFromConsole();
        obj.readCommands();
    }

    private void readCommands() {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String commandLinString = null;
        boolean proced = true;

        while (proced) {
            try {

                System.out.println("> ");
                commandLinString = br.readLine();

                StringTokenizer st = new StringTokenizer(commandLinString);
                String command = st.nextToken();
                if (command.equalsIgnoreCase("exit")) {
                    proced = false;
                }
                System.out.println("command :" + command);

            } catch (IOException e) {

                System.out.println("Exception when reading from command line" + e.getLocalizedMessage());

            }

        }

        //     System.out.println("read from Commandline : " + commandLinString);
    }
}

