import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class problemSolvingLabTwoTests {

    @Test
    public void testProblemSolvingLabTwoTestCaseOneReturnsTrue(){
        int[] numbers = new int[] {1, 5, 5, 11};

        System.out.println("Given; {1, 5, 5, 11} and should True");

        boolean result = problemSolvingLabTwo.findBiggest(numbers);
        assertTrue( result);

        System.out.println("Result: " + result);
    }

    @Test
    public void testProblemSolvingLabTwoTestCaseOneReturnsFalse(){
        int[] numbers = new int[] {2, 3, 4, 6};

        System.out.println("Given: {2, 3, 4, 6} should return False");

        boolean result = problemSolvingLabTwo.findBiggest(numbers);
        assertFalse(false);

        System.out.println("Result: " + result);
    }

    @Test
    public void testProblemSolvingLabTwoReturnsTrue(){
        int[] numbers = new int[] {7, 1, 3, 5, 9, 10, 1};

        System.out.println("Given: {7, 1, 3, 5, 9, 10, 1}");

        boolean result = problemSolvingLabTwo.findBiggest(numbers);
        assertTrue(true);

        System.out.println("Result: " + result);
    }

}
