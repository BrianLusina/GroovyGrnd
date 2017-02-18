package test.algorithms.strain;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;
import main.algorithms.strain.Strain;
import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class StrainTest extends TestCase {
    public StrainTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @org.junit.Test
    public void emptyKeep() {
        List<Integer> input = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>();
        Assert.assertEquals(expectedOutput, Strain.keep(input, x -> x < 10));
    }

    @org.junit.Test
    public void keepEverything() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3);
        Assert.assertEquals(expectedOutput, Strain.keep(input, x -> x < 10));
    }

    @org.junit.Test
    public void keepFirstAndLast() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(1, 3);
        Assert.assertEquals(expectedOutput, Strain.keep(input, x -> x % 2 != 0));
    }

    @org.junit.Test
    public void keepNeitherFirstNorLast() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedOutput = Arrays.asList(2, 4);
        Assert.assertEquals(expectedOutput, Strain.keep(input, x -> x % 2 == 0));
    }

    @org.junit.Test
    public void KeepStrings() {
        List<String> words = Arrays
                .asList("apple zebra banana zombies cherimoya zelot".split(" "));
        List<String> expectedOutput = Arrays.asList("zebra", "zombies", "zelot");
        Assert.assertEquals(expectedOutput,
                Strain.keep(words, x -> x.startsWith("z")));
    }

    @org.junit.Test
    public void KeepArrays() {
        List<List<Integer>> actual = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(5, 5, 5),
                Arrays.asList(5, 1, 2),
                Arrays.asList(2, 1, 2),
                Arrays.asList(1, 5, 2),
                Arrays.asList(2, 2, 1),
                Arrays.asList(1, 2, 5));
        List<List<Integer>> expectedOutput = Arrays.asList(
                Arrays.asList(5, 5, 5),
                Arrays.asList(5, 1, 2),
                Arrays.asList(1, 5, 2),
                Arrays.asList(1, 2, 5));
        Assert.assertEquals(expectedOutput,
                Strain.keep(actual, col -> col.contains(5)));
    }

    @org.junit.Test
    public void emptyDiscard() {
        List<Integer> input = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>();
        Assert.assertEquals(expectedOutput, Strain.discard(input, x -> x < 10));
    }

    @org.junit.Test
    public void discardNothing() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3);
        Assert.assertEquals(expectedOutput, Strain.discard(input, x -> x > 10));
    }

    @org.junit.Test
    public void discardFirstAndLast() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(2);
        Assert.assertEquals(expectedOutput, Strain.discard(input, x -> x % 2 != 0));

    }

    @org.junit.Test
    public void discardNeitherFirstNorLast() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedOutput = Arrays.asList(1, 3, 5);
        Assert.assertEquals(expectedOutput, Strain.discard(input, x -> x % 2 == 0));
    }

    @org.junit.Test
    public void discardStrings() {
        List<String> words = Arrays
                .asList("apple zebra banana zombies cherimoya zelot".split(" "));
        List<String> expectedOutput = Arrays.asList("apple", "banana", "cherimoya");
        Assert.assertEquals(expectedOutput,
                Strain.discard(words, x -> x.startsWith("z")));
    }

    @org.junit.Test
    public void discardArrays() {
        List<List<Integer>> actual = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(5, 5, 5),
                Arrays.asList(5, 1, 2),
                Arrays.asList(2, 1, 2),
                Arrays.asList(1, 5, 2),
                Arrays.asList(2, 2, 1),
                Arrays.asList(1, 2, 5));
        List<List<Integer>> expectedOutput = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 1, 2),
                Arrays.asList(2, 2, 1));
        Assert.assertEquals(expectedOutput,
                Strain.discard(actual, col -> col.contains(5)));
    }

    public static Test suite() {
        return new TestSuite(StrainTest.class);
    }
}
