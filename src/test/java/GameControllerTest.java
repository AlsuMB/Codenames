import org.junit.Test;
import ru.itis.controllers.GameController;

public class GameControllerTest {
    GameController gameController = new GameController();

    @Test
    public void updateChatTest() {
        gameController.updateChat("hello");
    }
}
