package sequence;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public interface FibonacciTest {
  Fibonacci createFibonacci();

  @Test
  default void testFibonacciValueAtVariousPosition() {
    var instance = createFibonacci();

    assertAll(
      () -> assertEquals(1, instance.fibonacci(0)),
      () -> assertEquals(1, instance.fibonacci(1)),
      () -> assertEquals(2, instance.fibonacci(2)),
      () -> assertEquals(3, instance.fibonacci(3)),
      () -> assertEquals(8, instance.fibonacci(5)),
      () -> assertEquals(89, instance.fibonacci(10)));

  }

  @Test
  default void testFibonacciValueForNegativePosition(){
    var instance = createFibonacci();

    var exception = assertThrows(RuntimeException.class, () ->
            instance.fibonacci(-1));

    assertEquals("Invalid index position", exception.getMessage());
  }
}
