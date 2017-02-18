package test.stringswords.NucleotideCount;
import junit.framework.TestCase;
import main.stringswords.NucleotideCount.DNA;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

public class DNATest extends TestCase {
    public DNATest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    @org.junit.Test
    public void testEmptyDnaStringHasNoAdenosine() {
        DNA dna = new DNA("");
        assertThat(dna.count('A')).isEqualTo(0);
    }

    @org.junit.Test
    public void testEmptyDnaStringHasNoNucleotides() {
        DNA dna = new DNA("");
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 0),
                entry('C', 0),
                entry('G', 0),
                entry('T', 0)
        );
    }

    @org.junit.Test
    public void testRepetitiveCytidineGetsCounted() {
        DNA dna = new DNA("CCCCC");
        assertThat(dna.count('C')).isEqualTo(5);
    }

    @org.junit.Test
    public void testRepetitiveSequenceWithOnlyGuanosine() {
        DNA dna = new DNA("GGGGGGGG");
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 0),
                entry('C', 0),
                entry('G', 8),
                entry('T', 0)
        );
    }

    @org.junit.Test
    public void testCountsOnlyThymidine() {
        DNA dna = new DNA("GGGGGTAACCCGG");
        assertThat(dna.count('T')).isEqualTo(1);
    }

    @org.junit.Test
    public void testCountsANucleotideOnlyOnce() {
        DNA dna = new DNA("CGATTGGG");
        dna.count('T');
        assertThat(dna.count('T')).isEqualTo(2);
    }

    @org.junit.Test
    public void testDnaCountsDoNotChangeAfterCountingAdenosine() {
        DNA dna = new DNA("GATTACA");
        dna.count('A');
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 3),
                entry('C', 1),
                entry('G', 1),
                entry('T', 2)
        );
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testValidatesNucleotides() {
        DNA dna = new DNA("GACT");
        dna.count('X');
    }

    @org.junit.Test
    public void testCountsAllNucleotides() {
        String s = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        DNA dna = new DNA(s);
        assertThat(dna.nucleotideCounts()).hasSize(4).contains(
                entry('A', 20),
                entry('C', 12),
                entry('G', 17),
                entry('T', 21)
        );
    }
}
