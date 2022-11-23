package rock.paper.scissors.another.polymorphism;


public interface Move {

    Move play(Move other);

    class Moves {

        public static Move ROCK = new Rock();
        public static Move SCISSORS = new Scissors();
        public static Move PAPER = new Paper();

        private record Rock() implements Move {
            @Override
            public Move play(Move other) {
                return switch (other){
                    case Scissors s -> this;
                    case Rock r -> null;
                    case Paper p -> p;
                    default -> throw new IllegalStateException("Unexpected value: " + other);
                };
            }
        }

        private record Paper() implements Move {
            @Override
            public Move play(Move other) {
                return switch (other){
                    case Scissors s -> s;
                    case Rock r -> this;
                    case Paper p -> null;
                    default -> throw new IllegalStateException("Unexpected value: " + other);
                };
            }
        }

        private record Scissors() implements Move {
            @Override
            public Move play(Move other) {
                return switch (other){
                    case Scissors s -> null;
                    case Rock r -> r;
                    case Paper p -> this;
                    default -> throw new IllegalStateException("Unexpected value: " + other);
                };
            }
        }
    }
}
