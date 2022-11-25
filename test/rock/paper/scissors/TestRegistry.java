package rock.paper.scissors;

import java.util.List;

public class TestRegistry {

    private static final List<TestData> TEST_DATA = List.of(
            new TestData<>(new rock.paper.scissors.simple.map.MapGame(), rock.paper.scissors.simple.map.MOVE.ROCK, rock.paper.scissors.simple.map.MOVE.PAPER, rock.paper.scissors.simple.map.MOVE.SCISSORS),
            new TestData<>(new rock.paper.scissors.sort.of.polymorphism.SortOfPolymorphismGame(), new rock.paper.scissors.sort.of.polymorphism.Move.Rock(), new rock.paper.scissors.sort.of.polymorphism.Move.Paper(), new rock.paper.scissors.sort.of.polymorphism.Move.Scissors()),
            new TestData<>(new rock.paper.scissors.complicated.enumeration.with.lambda.ComplicatedEnumerationWithLambde(), rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.ROCK, rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.PAPER, rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.SCISSORS),
            new TestData<>(new rock.paper.scissors.another.polymorphism.AnotherPolymorphism(), rock.paper.scissors.another.polymorphism.Move.Moves.ROCK, rock.paper.scissors.another.polymorphism.Move.Moves.PAPER, rock.paper.scissors.another.polymorphism.Move.Moves.SCISSORS)
            );

    static List<TestData> testData() {
                return TEST_DATA;
            }

    public record TestData<M>(Game<M> game, M rock, M paper, M scissors){ }
}
