package rock.paper.scissors.simple.map;

import rock.paper.scissors.IGame;

import java.util.Map;

import static rock.paper.scissors.Constants.*;

public class MapGame implements IGame<MOVE> {

    private static final Map<MOVE, Map<MOVE, String>> results =
            Map.of(
                    MOVE.ROCK, Map.of(MOVE.SCISSORS, PLAYER_1_WINS, MOVE.PAPER, PLAYER_2_WINS, MOVE.ROCK, DRAW),
                    MOVE.PAPER, Map.of(MOVE.ROCK, PLAYER_1_WINS, MOVE.SCISSORS, PLAYER_2_WINS, MOVE.PAPER, DRAW),
                    MOVE.SCISSORS, Map.of(MOVE.PAPER, PLAYER_1_WINS, MOVE.ROCK, PLAYER_2_WINS, MOVE.SCISSORS, DRAW));

    public String play(MOVE player1, MOVE player2) {
        return results.get(player1).get(player2);
    }

}
