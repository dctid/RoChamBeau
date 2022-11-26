package rock.paper.scissors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static rock.paper.scissors.Constants.*;
import static rock.paper.scissors.assertion.AssertRockPaperScissors.assertRockPaperScissors;

class GameTest {
    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void rockWins(TestRegistry.TestData<M> datum) {
       assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.rock()).andPlayer2moveIs(datum.scissors()).resultsIn(PLAYER_1_WINS);
       assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.scissors()).andPlayer2moveIs(datum.rock()).resultsIn(PLAYER_2_WINS);
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void paperWins(TestRegistry.TestData<M> datum) {
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.paper()).andPlayer2moveIs(datum.rock()).resultsIn(PLAYER_1_WINS);
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.rock()).andPlayer2moveIs(datum.paper()).resultsIn(PLAYER_2_WINS);
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void scissorsWins(TestRegistry.TestData<M> datum) {
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.scissors()).andPlayer2moveIs(datum.paper()).resultsIn(PLAYER_1_WINS);
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.paper()).andPlayer2moveIs(datum.scissors()).resultsIn(PLAYER_2_WINS);
    }

    @ParameterizedTest
    @ArgumentsSource(TestRegistry.class)
    <M> void draws(TestRegistry.TestData<M> datum) {
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.rock()).andPlayer2moveIs(datum.rock()).resultsIn(DRAW);
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.paper()).andPlayer2moveIs(datum.paper()).resultsIn(DRAW);
        assertRockPaperScissors(datum.game()).whenPlayer1MoveIs(datum.scissors()).andPlayer2moveIs(datum.scissors()).resultsIn(DRAW);
    }
}