import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class MergeArraysTest {
    
    @Test
    void testString() {
        String[] one = {"b", "d", "e"};
        String[] two = {"a", "c"};
        ArrayList<String> output = MergeArrays.merge(one, two);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a"); expected.add("b"); 
        expected.add("c"); expected.add("d");
        expected.add("e");
        assertEquals(expected, output);
        
    }
    
    @Test
    void testSInteger() {
        Integer[] one = {1};
        Integer[] two = {2, 3};
        ArrayList<Integer> output = MergeArrays.merge(one, two);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(2); 
        expected.add(3);
        assertEquals(expected, output);
        
    }

}