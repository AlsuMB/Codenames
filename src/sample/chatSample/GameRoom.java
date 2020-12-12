package sample.chatSample;

import java.util.ArrayList;
import java.util.List;

public class GameRoom {
    public int number;
    public List<Connection> user = new ArrayList<>();

    public GameRoom(int number) {
        this.number = number;
    }

    public void close(boolean b) {
        for (Connection connection : user) {
            connection.close(true);
        }
    }
}
