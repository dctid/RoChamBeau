package rock.paper.scissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static rock.paper.scissors.Constants.*;

class GameTest {

    @Test
    void rockWins() {
        TestRegistery.data.stream().forEach(datum-> {
            assertEquals(PLAYER_1_WINS, datum.game().play(datum.rock(), datum.scissors()), datum.getClass().getName());
            assertEquals(PLAYER_2_WINS, datum.game().play(datum.scissors(), datum.rock()));
        });
    }

    @Test
    void paperWins() {
        TestRegistery.data.stream().forEach(datum -> {
            assertEquals(PLAYER_1_WINS, datum.game().play(datum.paper(), datum.rock()));
            assertEquals(PLAYER_2_WINS, datum.game().play(datum.rock(), datum.paper()));
        });
    }

    @Test
    void scissorsWins() {
        TestRegistery.data.stream().forEach(datum -> {
            assertEquals(PLAYER_1_WINS, datum.game().play(datum.scissors(), datum.paper()));
            assertEquals(PLAYER_2_WINS, datum.game().play(datum.paper(), datum.scissors()));
        });
    }

    @Test
    void draws() {
        TestRegistery.data.stream().forEach(datum -> {
            assertEquals(DRAW, datum.game().play(datum.scissors(), datum.scissors()));
            assertEquals(DRAW, datum.game().play(datum.rock(), datum.rock()));
            assertEquals(DRAW, datum.game().play(datum.paper(), datum.paper()));
        });
    }

}