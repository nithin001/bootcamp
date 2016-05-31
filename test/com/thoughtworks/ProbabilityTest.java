package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gnithin on 5/30/16.
 */
public class ProbabilityTest {

    @Test
    public void symmetric() throws Exception {
        Probability a = new Probability(0.2);
        Probability b = new Probability(0.2);
        assertThat(a,is(b));
        assertThat(b,is(a));
    }

    @Test
    public void transitive() throws Exception {
        Probability a = new Probability(0.2);
        Probability b = new Probability(0.2);
        Probability c = new Probability(0.2);
        assertThat(a,is(b));
        assertThat(b,is(c));
        assertThat(a,is(c));
    }

    @Test
    public void reflexive() throws Exception {
        Probability a = new Probability(0.2);
        assertThat(a,is(a));
     }

    @Test
    public void shouldBeUnequalIfNull() throws Exception {
        Probability a = new Probability(0.2);
        Assert.assertFalse(a.equals(null));
    }

    @Test
    public void shouldBeUnequalIfObjectNotProbability() throws Exception {
        Probability a = new Probability(0.2);
        Assert.assertFalse(a.equals(2.0));
    }


    @Test
    public void testProbabilityAnd() throws Exception {
        Probability prob1=new Probability(0.4);
        Probability prob2=new Probability((0.6));
        Probability prob3=prob1.and(prob2);
        assertThat(prob3, is(new Probability(0.24)));
    }

    @Test
    public void testProbabilityOr() throws Exception {
        Probability prob1=new Probability(0.4);
        Probability prob2=new Probability((0.6));
        assertThat(prob1.or(prob2), is(new Probability(1.0)));
    }

    @Test
    public void testNegation() throws Exception {
        Probability prob = new Probability(0.2);
        Probability expectedProbability = new Probability(0.8);

        assertThat(prob.negate(),is(expectedProbability));

    }
}