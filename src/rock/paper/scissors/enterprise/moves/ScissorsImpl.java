package rock.paper.scissors.enterprise.moves;

public class ScissorsImpl implements IScissors{

    private final MoveEnum scissors;

    public ScissorsImpl() {
        scissors = MoveEnum.SCISSORS;
    }

    @Override
    public MoveEnum getMove() {
        return scissors;
    }
}
