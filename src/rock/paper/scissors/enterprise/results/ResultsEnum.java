package rock.paper.scissors.enterprise.results;

import rock.paper.scissors.Constants;

public enum ResultsEnum {
    WIN(Constants.PLAYER_1_WINS), LOSE(Constants.PLAYER_2_WINS), DRAW(Constants.DRAW);

    private final String string;

    ResultsEnum(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
