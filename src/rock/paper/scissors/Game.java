package rock.paper.scissors;

public interface Game<M> {
    String play(M player1, M player2);
}
