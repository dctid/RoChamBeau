package rock.paper.scissors.another.polymorphism;

import rock.paper.scissors.Game;

import static rock.paper.scissors.Constants.*;

public class AnotherPolymorphism implements Game<Move> {

    public String play(Move player1, Move player2) {
        var winner = player1.play(player2);
        if (player1 == winner){
            return PLAYER_1_WINS;
        } else if (player2 == winner) {
            return PLAYER_2_WINS;
        } else {
            return DRAW;
        }
    }
}
