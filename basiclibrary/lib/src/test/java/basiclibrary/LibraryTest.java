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
        float result =library.CalculatingAverages(new int[]{1,1,1,1});
       assertEquals(1,result);

    }
    @Test
    void ArraysOfArrays(){
        int[][] test = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        float result =library.ArraysOfArrays(test);
        assertEquals(60.0,result);
    }


}
