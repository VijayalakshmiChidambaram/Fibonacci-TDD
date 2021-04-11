package sequence;

import java.util.List;

public class FibonacciImperative extends Fibonacci {
  @Override
  public int calculateFibonacci(int position) {
    var series = List.of(0, 1);

    for(int i = 0; i < position; i++) {
      series = List.of(series.get(1), series.get(0) + series.get(1));
    }

    return series.get(1);
  }
}
