package rock.paper.scissors.enterprise;

import rock.paper.scissors.enterprise.moves.*;
import rock.paper.scissors.enterprise.results.*;

public final class Constants {
    private static final IRock ROCK_MOVE = new RockImpl();
    private static final IPaper PAPER_MOVE = new PaperImpl();
    private static final IScissors SCISSORS_MOVE = new ScissorsImpl();
    private static final IWinResult RESULT_WIN = new WinResultImpl();
    private static final ILoseResult RESULT_LOSE = new LoseResultImpl();
    private static final IDrawResult DRAW_RESULT = new DrawResultImpl();

    public IMove getRock(){
        return ROCK_MOVE;
    }

    public IMove getPaper(){
        return PAPER_MOVE;
    }

    public IMove getScissors(){
        return SCISSORS_MOVE;
    }

    public IResult getResultWin(){
        return RESULT_WIN;
    }

    public IResult getResultsLose(){
        return RESULT_LOSE;
    }

    public IResult getDrawResult(){
        return DRAW_RESULT;
    }

}
