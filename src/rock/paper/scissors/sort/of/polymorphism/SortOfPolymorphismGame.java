package rock.paper.scissors.sort.of.polymorphism;

import rock.paper.scissors.Game;

public class SortOfPolymorphismGame implements Game<Move> {

    public String play(Move player1, Move player2) {
        return player1.play(player2);
    }
}
