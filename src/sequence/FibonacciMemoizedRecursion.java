package sequence;

import java.util.*;

public class FibonacciMemoizedRecursion extends FibonacciRecursive {
  private Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 1, 1, 1));

  @Override
  public int calculateFibonacci(int position) {
    if (!cache.containsKey(position)) {
      cache.put(position, super.calculateFibonacci(position));
    }

    return cache.get(position);
  }
}
