package rock.paper.scissors.sort.of.polymorphism;

import rock.paper.scissors.IGame;

public class SortOfPolymorphismGame implements IGame<Move> {

    public String play(Move player1, Move player2) {
        return player1.play(player2);
    }
}
