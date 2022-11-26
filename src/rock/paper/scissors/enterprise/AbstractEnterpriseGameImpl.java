package rock.paper.scissors.enterprise;

import rock.paper.scissors.enterprise.moves.IMove;
import rock.paper.scissors.enterprise.moves.MoveEnum;

import java.util.Objects;

public abstract class AbstractEnterpriseGameImpl implements IEnterpriseGame<IMove> {

    private final Constants constants = new Constants();

    @Override
    public String play(IMove player1, IMove player2) {
        String result = null;
        if (player1.getMove() == MoveEnum.SCISSORS && player2.getMove() == MoveEnum.PAPER) {
            result = constants.getResultWin().getResult();
        } else if (player1.getMove().ordinal() == player2.getMove().ordinal()) {
            result = constants.getDrawResult().getResult();
        } else if (player1.getMove().ordinal() - player2.getMove().ordinal() < 0 &&
                player1.getMove().ordinal() - player2.getMove().ordinal() > -2 ||
                player1.getMove() == MoveEnum.SCISSORS && player2.getMove() == MoveEnum.ROCK) {
            result = constants.getResultsLose().getResult();
        } else {
            result = constants.getResultWin().getResult();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEnterpriseGameImpl that = (AbstractEnterpriseGameImpl) o;
        return Objects.equals(constants, that.constants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constants);
    }

    @Override
    public String toString() {
        return "AbstractEnterpriseGameImpl{" +
                "constants=" + constants +
                '}';
    }
}
