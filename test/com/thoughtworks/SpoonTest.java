package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * Created by gnithin on 5/31/16.
 */
public class SpoonTest {

    @Test
    public void threeTeaSpoonsEqualsThreeTeaSpoons() throws Exception {
        Measure teaspoon = Measure.createTeaSpoon(3);
        assertThat(teaspoon, is(Measure.createTeaSpoon(3)));
    }

    @Test
    public void equalityNullCheck() throws Exception {
        Measure teaspoon = Measure.createTeaSpoon(1);
        assertFalse(teaspoon.equals(null));
    }

    @Test
    public void threeTeaSpoonsEqualsOneTableSpoon() throws Exception {
        Measure teaspoon = Measure.createTeaSpoon(3);
        Measure tablespoon = Measure.createTableSpoon(1);
        assertThat(teaspoon, is(tablespoon));
    }

    @Test
    public void oneTableSpoonEqualsThreeTeaSpoons() throws Exception {
        Measure teaspoon = Measure.createTeaSpoon(3);
        Measure tablespoon = Measure.createTableSpoon(1);
        assertThat(tablespoon, is(teaspoon));
    }

    @Test
    public void oneTableSpoonNotEqualsOneTeaSpoons() throws Exception {
        Measure teaspoon = Measure.createTeaSpoon(1);
        Measure tablespoon = Measure.createTableSpoon(1);
        assertFalse(tablespoon.equals(teaspoon));
    }


    @Test
    public void oneOunceTwoTableSpoons() throws Exception {
        Measure ounce = Measure.createOunce(1);
        Measure tablespoons = Measure.createTableSpoon(2);
        assertThat(ounce, is(tablespoons));
    }

    @Test
    public void oneCupEightOunces() throws Exception {
        Measure cup = Measure.createCup(1);
        Measure ounces = Measure.createOunce(8);
        assertThat(cup, is(ounces));
    }

    @Test
    public void eightOuncesOneCup() throws Exception {
        Measure cup = Measure.createCup(1);
        Measure ounces = Measure.createOunce(8);
        assertThat(ounces, is(cup));
    }

    @Test
    public void twoTableSpoonsOneOunce() throws Exception {
        Measure ounce = Measure.createOunce(1);
        Measure tablespoons = Measure.createTableSpoon(2);
        assertThat(tablespoons, is(ounce));
    }

    @Test
    public void oneCupNotEqualsSevenOunces() throws Exception {
        Measure cup = Measure.createCup(1);
        Measure ounces = Measure.createOunce(7);
        assertFalse(cup.equals(ounces));
    }

}
