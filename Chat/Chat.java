package Chat;

public interface Chat {

    void writeMessage(String message) throws Exception;

    String[] readMessage() throws Exception;
}
