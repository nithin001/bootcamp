package com.thoughtworks;

/**
 * Created by gnithin on 5/31/16.
 */
public class Measure {
    private int totalCapacity;

    private static final int TEASPOON_FACTOR = 1;
    private static final int TABLESPOON_FACTOR = 3 * TEASPOON_FACTOR;
    private static final int OUNCE_FACTOR = TABLESPOON_FACTOR * 2;
    private static final int CUP_FACTOR = OUNCE_FACTOR * 8;


    private Measure(int capacity) {
        this.totalCapacity = capacity;
    }

    public static Measure createTeaSpoon(int quantity) {
        return new Measure(quantity * TEASPOON_FACTOR);
    }

    public static Measure createTableSpoon(int quantity) {
        return new Measure(quantity * TABLESPOON_FACTOR);
    }

    public static Measure createOunce(int quantity) {
        return new Measure(quantity * OUNCE_FACTOR);
    }

    public static Measure createCup(int quantity) {
        return new Measure(quantity * CUP_FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measure spoon = (Measure) o;

        return totalCapacity == spoon.totalCapacity;

    }

    @Override
    public int hashCode() {
        return totalCapacity;
    }


}
