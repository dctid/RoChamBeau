package rock.paper.scissors;

public interface IGame<M> {
    String play(M player1, M player2);
}
