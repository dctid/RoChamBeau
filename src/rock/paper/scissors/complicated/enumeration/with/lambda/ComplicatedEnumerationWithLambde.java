package rock.paper.scissors.complicated.enumeration.with.lambda;


import rock.paper.scissors.Game;

import static rock.paper.scissors.Constants.*;

public class ComplicatedEnumerationWithLambde implements Game<MOVE> {

    public String play(MOVE player1, MOVE player2) {
        return switch (player1.versus(player2)) {
            case WIN -> PLAYER_1_WINS;
            case LOSE -> PLAYER_2_WINS;
            case DRAW -> DRAW;
        };
    }
}
