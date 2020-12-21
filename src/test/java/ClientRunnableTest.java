import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.itis.sockets.server.ClientRunnable;

import java.io.*;
import java.util.concurrent.CountDownLatch;

public class ClientRunnableTest {
    ClientRunnable clientRunnable;

    @Before
    public void setUp() throws FileNotFoundException {
        clientRunnable = new ClientRunnable("Alsu", "Red", new BufferedReader(new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        })), new PrintWriter("kk.txt"), new CountDownLatch(4));
    }

    @Test
    public void constructorTest() throws FileNotFoundException {
         ClientRunnable clientRunnable1 = new ClientRunnable("Alsu", "Red", new BufferedReader(new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        })), new PrintWriter("kk.txt"), new CountDownLatch(4));
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(clientRunnable.getName(), "Alsu");
    }

    @Test
    public void setNameTest() {
        clientRunnable.setName("Salsu");
        Assert.assertEquals(clientRunnable.getName(), "Salsu[Red]");
    }
}
