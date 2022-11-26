package rock.paper.scissors.enterprise.results;

public class LoseResultImpl implements ILoseResult {

    private final ResultsEnum lose = ResultsEnum.LOSE;
    @Override
    public String getResult() {
        return lose.toString();
    }
}
