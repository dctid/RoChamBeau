package rock.paper.scissors.enterprise.moves;

import java.io.Serializable;

public interface IMove extends Serializable {

    MoveEnum getMove();
}
