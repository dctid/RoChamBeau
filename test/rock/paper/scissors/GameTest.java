package rock.paper.scissors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static rock.paper.scissors.Constants.*;

class GameTest {

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void rockWins(TestRegistry.TestData<M> datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.rock(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.scissors(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void paperWins(TestRegistry.TestData<M> datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.paper(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.rock(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void scissorsWins(TestRegistry.TestData<M> datum) {
        assertEquals(PLAYER_1_WINS, datum.game().play(datum.scissors(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(PLAYER_2_WINS, datum.game().play(datum.paper(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void draws(TestRegistry.TestData<M> datum) {
        assertEquals(DRAW, datum.game().play(datum.scissors(), datum.scissors()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(DRAW, datum.game().play(datum.rock(), datum.rock()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
        assertEquals(DRAW, datum.game().play(datum.paper(), datum.paper()), buildFailedMessage(datum.game(), datum.scissors(), datum.scissors()));
    }

    private static <M> String buildFailedMessage(Game game, M player1, M player2) {
        return "Class [%s] failed when [%s] played [%s]".formatted(game.getClass().getSimpleName(), player1, player2);
    }

}