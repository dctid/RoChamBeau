package rock.paper.scissors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static rock.paper.scissors.Constants.*;

class GameTest {

    @ParameterizedTest
    @MethodSource("rock.paper.scissors.TestRegistry#testData")
    void rockWins(TestRegistry.TestData datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.rock(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.scissors(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @MethodSource("rock.paper.scissors.TestRegistry#testData")
    void paperWins(TestRegistry.TestData datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.paper(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.rock(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @MethodSource("rock.paper.scissors.TestRegistry#testData")
    void scissorsWins(TestRegistry.TestData datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.scissors(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.paper(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @MethodSource("rock.paper.scissors.TestRegistry#testData")
    void draws(TestRegistry.TestData datum) {
        assertEquals(DRAW, datum.game().play(datum.scissors(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(DRAW, datum.game().play(datum.rock(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(DRAW, datum.game().play(datum.paper(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    private static <M> String buildFailedMessage(Game game, M player1, M player2) {
        return "Class [%s] failed when [%s] played [%s]".formatted(game.getClass().getSimpleName(), player1, player2);
    }

}