package searcher;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BinaryTest {
    @Test public void NumberDoesNotExist(){
        int[] searching = {1,3, 4, 6, 7, 11, 14, 22};
        int smalllNumber = 0;
        String expected = "number is not exist";
        assertEquals(expected,BinarySearch.findingNumber(9,searching,7,smalllNumber));
    }
    @Test public void NumberIsExist(){
        int[] searching = {1,3, 4, 6, 7, 11, 14, 22};
        int smalllNumber = 0;
        int expected = 2;
        assertEquals(expected,BinarySearch.findingNumber(4,searching,7,smalllNumber));
    }
}

