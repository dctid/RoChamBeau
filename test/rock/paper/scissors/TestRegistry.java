package rock.paper.scissors;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.List;
import java.util.stream.Stream;

public class TestRegistry implements ArgumentsProvider {

    private static final List<TestData<?>> TEST_DATA = List.of(
            new TestData<>(new rock.paper.scissors.simple.map.MapGame(), rock.paper.scissors.simple.map.MOVE.ROCK, rock.paper.scissors.simple.map.MOVE.PAPER, rock.paper.scissors.simple.map.MOVE.SCISSORS),
            new TestData<>(new rock.paper.scissors.sort.of.polymorphism.SortOfPolymorphismGame(), new rock.paper.scissors.sort.of.polymorphism.Move.Rock(), new rock.paper.scissors.sort.of.polymorphism.Move.Paper(), new rock.paper.scissors.sort.of.polymorphism.Move.Scissors()),
            new TestData<>(new rock.paper.scissors.complicated.enumeration.with.lambda.ComplicatedEnumerationWithLambde(), rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.ROCK, rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.PAPER, rock.paper.scissors.complicated.enumeration.with.lambda.MOVE.SCISSORS),
            new TestData<>(new rock.paper.scissors.another.polymorphism.AnotherPolymorphism(), rock.paper.scissors.another.polymorphism.Move.Moves.ROCK, rock.paper.scissors.another.polymorphism.Move.Moves.PAPER, rock.paper.scissors.another.polymorphism.Move.Moves.SCISSORS),
            new TestData<>(new rock.paper.scissors.enterprise.EnterpriseGameImpl(), new rock.paper.scissors.enterprise.Constants().getRock(), new rock.paper.scissors.enterprise.Constants().getPaper(), new rock.paper.scissors.enterprise.Constants().getScissors())
    );

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return TEST_DATA.stream().map(Arguments::of);
    }

    public record TestData<M>(Game<M> game, M rock, M paper, M scissors) {
    }
}
