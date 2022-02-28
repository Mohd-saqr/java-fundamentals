/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

    @Test
    void containsDuplicatesTest(){

        boolean result1 =library.containsDuplicates(new int[]{1,2,3,2,4});
        assertSame(true,result1);
    }

    @Test
    void CalculatingAverages(){
        double result =library.CalculatingAverages(new int[]{10,2,3,4});
       assertEquals(4.75,result);

    }
    @Test
    void ArraysOfArrays(){
        int[][] test = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[][] test2 = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 0, 0, 0, 0, 0, 0},
                {55, 54, 60, 53, 59, 57, 61},
                {0, 0, 0, 0, 1, 2, 3}
        };
        int[] result =library.ArraysOfArrays(test);
        int[] result2 =library.ArraysOfArrays(test2);

        assertArrayEquals(new int[]{55, 54, 60, 53, 59, 57, 61},result);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0},result2);
    }


}
