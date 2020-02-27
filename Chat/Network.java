package Chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Network {
    void connect(String hostname, int port_number) throws IOException;

    void open(int port_number) throws IOException;

    InputStream getInputStream() throws IOException;

    OutputStream getOutputStream() throws IOException;

    void close() throws IOException;
}
