package Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkImplementation implements Network {

    public static final int PORT_NUMBER = 7777;
    public static final String HOST_NAME = "127.0.0.1";
    public Socket socket;
    private InputStream is;
    private OutputStream os;
    private ServerSocket serversocket;
    //public Network network;



    @Override
    public void connect(String hostname, int port_number) throws IOException {


        try {
            this.socket = new Socket(hostname, port_number);
            this.is = this.socket.getInputStream();
            this.os = this.socket.getOutputStream();

            DataInputStream din = new DataInputStream(this.socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(this.socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "", str2 = "";
            while (!str.equals("stop")) {
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2 = din.readUTF();
                System.out.println("Server says: " + str2);
            }

            dout.close();
        } catch (Exception ex) {
            System.out.println("Error,while connecting with client :(");
        }


    }


    @Override
    public void open(int port_number) throws IOException {



        this.serversocket = new ServerSocket(PORT_NUMBER);
        // sollten hier eine Schleife machen, um mehr Clients zu akzeptieren
        this.socket = serversocket.accept();

        this.os = socket.getOutputStream();
        this.is = socket.getInputStream();

        DataInputStream din = new DataInputStream(this.socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(this.socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("client says: " + str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();


    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (this.is == null) {
            throw new IOException("not yet connected");
        }

        return this.is;
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        if (this.os == null) {
            throw new IOException("not yet connected");
        }

        return this.os;
    }

    @Override
    public void close() throws IOException {
        try {
            if (this.socket != null) {
                this.socket.close();
            }
        } catch (IOException ex) {
            System.err.println("problem with closing the Socket !");
        }

    }
}
