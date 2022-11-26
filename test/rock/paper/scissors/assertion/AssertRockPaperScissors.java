package rock.paper.scissors.assertion;

import rock.paper.scissors.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertRockPaperScissors {

    public static <M> GameData<M> assertRockPaperScissors(Game<M> game){
        return new GameData<>(game);
    }

    private static <M> void assertRockPaperScissors(AssertRockPaperScissors.ResultData<M> data) {
       assertEquals(data.result, data.game.play(data.player1Move, data.player2Move), testFailedMessage(data));
    }

    private static <M> String testFailedMessage(AssertRockPaperScissors.ResultData<M> data) {
        return "Class [%s] failed when [%s] played [%s]".formatted(data.game.getClass().getSimpleName(), data.player1Move, data.player2Move);
    }

    public static class GameData<M> {
        final Game<M> game;

        private GameData(Game<M> game) {
            this.game = game;
        }

        public Player1MoveData<M> whenPlayer1MoveIs(M player1Move){
            return new Player1MoveData<>(this.game, player1Move);
        }

    }
    public static class Player1MoveData<M> extends GameData<M> {
        final M player1Move;

        private Player1MoveData(Game<M> game, M player1Move) {
            super(game);
            this.player1Move = player1Move;
        }

        public Player2MoveData<M> andPlayer2moveIs(M player2Move){
            return new Player2MoveData<>(this, player2Move);
        }

    }

    public static class Player2MoveData<M> extends Player1MoveData<M> {
        final M player2Move;

        private Player2MoveData(Player1MoveData<M> player1MoveData, M player2Move) {
            super(player1MoveData.game, player1MoveData.player1Move);
            this.player2Move = player2Move;
        }

        public void resultsIn(String result){
            new ResultData<>(this, result).resultsIn();
        }
    }

    private static class ResultData<M> extends Player2MoveData<M> {

        final String result;

        private ResultData(Player2MoveData<M> player2MoveData, String result) {
            super(player2MoveData, player2MoveData.player2Move);
            this.result = result;
        }

        public void resultsIn(){
           assertRockPaperScissors(this);
        }
    }

}
