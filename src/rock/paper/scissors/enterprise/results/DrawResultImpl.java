package rock.paper.scissors.enterprise.results;

public class DrawResultImpl implements IDrawResult {
    private final ResultsEnum draw = ResultsEnum.DRAW;

    @Override

    public String getResult() {
        return draw.toString();
    }
}
