package rock.paper.scissors.enterprise;


import rock.paper.scissors.enterprise.moves.IMove;

public class EnterpriseGameImpl extends AbstractEnterpriseGameImpl {
    @Override
    public String play(IMove player1, IMove player2) {
        // Check for null so they aren't referenced
        if(player1 == null || player2 == null)
            throw new NullPointerException("One of the players was null");
        return super.play(player1, player2);
    }
}
