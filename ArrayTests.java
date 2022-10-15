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
  public void testReverseinPlaceMult() {
    int [] input1 = {1,3,5,7,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9,7,5,3,1}, input1); //Incorrect implementation results in {1,3,5,3,1}
  }

  @Test
  public void testReverseinPlaceTwo() {
    int [] input1 = {1,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2,1}, input1); //Incorrect implementation results in {2,2}
  }

  @Test
  public void testReversedTwo() {
    int[] input1 = {3,2};
    assertArrayEquals(new int[]{2,3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMult() {
    int[] input1 = {2,3,5,7,9};
    assertArrayEquals(new int[]{9,7,5,3,2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {5.0, 10.0, 7.0, 2.2};
    assertEquals(7.3, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
