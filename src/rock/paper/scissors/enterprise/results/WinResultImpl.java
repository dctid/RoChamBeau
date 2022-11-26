package rock.paper.scissors.enterprise.results;

public class WinResultImpl implements IWinResult {

    private ResultsEnum win = ResultsEnum.WIN;

    @Override
    public String getResult() {
        return win.toString();
    }
}
