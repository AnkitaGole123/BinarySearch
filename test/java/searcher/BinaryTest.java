package searcher;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BinaryTest {
    @Test public void NumberDoesNotExist(){
        List<Integer> searchIn = Arrays.asList(1,3, 4, 6, 7, 11, 14, 22);
        int expected = -1;
        assertEquals(expected,BinarySearch.findNumberInList(9,searchIn,7,0));
    }
    @Test public void NumberDoesExist(){
        List<Integer> searchIn = Arrays.asList(1,3, 4, 6, 7, 11, 14, 22);
        int expected = 2;
        assertEquals(expected,BinarySearch.findNumberInList(4,searchIn,7,0));
    }
}

