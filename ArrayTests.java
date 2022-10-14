import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceMultiple() {
    int[] input1 = { 3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3 }, input1);
	}

  @Test 
	public void testReverseMultiple() {
    int[] input1 = { 3,2,1 };
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ 1,2,3 }, output1);
	}

  @Test 
	public void testAverageWithoutLowest() {
    double[] input1 = { 5.0, 1.0, 2.0, 4.0, 1.0 };
    double output1 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3.0, output1, 0);
	}
}
