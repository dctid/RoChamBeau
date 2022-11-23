package rock.paper.scissors.sort.of.polymorphism;


import static rock.paper.scissors.Constants.*;

public interface Move {

    String play(Move other);

    class Rock implements Move {
        @Override
        public String play(Move other) {
            if (Scissors.class.equals(other.getClass())) {
                return PLAYER_1_WINS;
            } else if (Paper.class.equals(other.getClass())) {
                return PLAYER_2_WINS;
            }
            return DRAW;
        }
    }

    class Scissors implements Move {
        @Override
        public String play(Move other) {
            if (this.getClass() == other.getClass())
                return DRAW;
            if (other.getClass() == Paper.class)
                return PLAYER_1_WINS;
            return PLAYER_2_WINS;
        }
    }

    class Paper implements Move {
        @Override
        public String play(Move other) {
            if (this.getClass() == other.getClass())
                return DRAW;
            if (other.getClass() == Rock.class)
                return PLAYER_1_WINS;
            return PLAYER_2_WINS;
        }
    }

}
