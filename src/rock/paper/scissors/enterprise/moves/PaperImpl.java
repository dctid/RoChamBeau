package rock.paper.scissors.enterprise.moves;

public class PaperImpl implements IPaper {

    private final MoveEnum paper;

    public PaperImpl() {
        paper = MoveEnum.PAPER;
    }

    @Override
    public MoveEnum getMove() {
        return paper;
    }
}
