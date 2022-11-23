package rock.paper.scissors.complicated.enumeration.with.lambda;


public enum MOVE {
    ROCK(VersusLambdas.ROCK_VERSUS), PAPER(VersusLambdas.PAPER_VERSUS), SCISSORS(VersusLambdas.SCISSORS_VERSUS);

    public enum RESULT {
        WIN, LOSE, DRAW
    }

    private final Versus versusLambda;

    MOVE(Versus versusLambda) {
        this.versusLambda = versusLambda;
    }

    public RESULT versus(MOVE other) {
        return versusLambda.play(other);
    }

    private interface Versus {
        RESULT play(MOVE other);
    }

    private static final class VersusLambdas {
        public static final Versus ROCK_VERSUS = ((other) ->
                switch (other) {
                    case SCISSORS -> RESULT.WIN;
                    case PAPER -> RESULT.LOSE;
                    case ROCK -> RESULT.DRAW;
                });
        public static final Versus PAPER_VERSUS = ((other) ->
                switch (other) {
                    case ROCK -> RESULT.WIN;
                    case SCISSORS -> RESULT.LOSE;
                    case PAPER -> RESULT.DRAW;
                });
        public static final Versus SCISSORS_VERSUS = ((other) ->
                switch (other) {
                    case PAPER -> RESULT.WIN;
                    case ROCK -> RESULT.LOSE;
                    case SCISSORS -> RESULT.DRAW;
                });
    }
}
