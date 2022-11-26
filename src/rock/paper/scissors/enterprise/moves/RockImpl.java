package rock.paper.scissors.enterprise.moves;

public class RockImpl implements IRock {

    private final MoveEnum rock;

    public RockImpl() {
        rock = MoveEnum.ROCK;
    }

    @Override
    public MoveEnum getMove() {
        return rock;
    }
}
