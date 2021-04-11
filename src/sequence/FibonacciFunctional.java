package sequence;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciFunctional extends Fibonacci {

  @Override
  public int calculateFibonacci(int position) {
    return Stream.iterate(List.of(0, 1), series -> List.of(series.get(1), series.get(0) + series.get(1)))
      .map(series -> series.get(1))
      .skip(position)
      .findFirst()
      .orElse(0);
  }
}
