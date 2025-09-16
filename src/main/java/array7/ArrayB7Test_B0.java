package array7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ArrayB7Test_B0 {
 @Test
 public void TestCase1() {
	 int ar[] = {33,34,23,12};
	 Assertions.assertEquals(34,ArrayB7.arrayMax(ar));
 }
 @Test
 public void TestCase2() {
	 int ar[] = {-1,-2, -3,-4};
	 Assertions.assertEquals(-1,ArrayB7.arrayMax(ar));
 }
}
