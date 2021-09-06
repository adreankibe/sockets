import java.io.IOException;

public class ClientThread extends Thread
{
    int port;
    String ip;

    public ClientThread(String ipAddress, int portNumber)
    {
        ip = ipAddress;
        port = portNumber;
    }

    public void run()
    {
        try {
            ClientProtocol cp = new ClientProtocol(ip,port);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
