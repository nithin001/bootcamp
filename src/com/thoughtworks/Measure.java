package com.thoughtworks;

/**
 * Created by gnithin on 5/31/16.
 */
public class Measure {
    private int totalCapacity;



    private Measure(int quantity) {
        this.totalCapacity = quantity;
    }

    public static Measure createTeaSpoon(int quantity) {
        return new Measure(Type.TEASPOON.getInBaseUnits(quantity));
    }

    public static Measure createTableSpoon(int quantity) {
        return new Measure(Type.TABLESPOON.getInBaseUnits(quantity));
    }

    public static Measure createOunce(int quantity) {
        return new Measure(Type.OUNCE.getInBaseUnits(quantity));
    }

    public static Measure createCup(int quantity) {
        return new Measure(Type.CUP.getInBaseUnits(quantity));
    }

    public static Measure createPint(int quantity) {
        return new Measure(Type.PINT.getInBaseUnits(quantity));
    }

    public static Measure createQuart(int quantity) {
        return new Measure(Type.QUART.getInBaseUnits(quantity));
    }

    public static Measure createGallon(int quantity) {
        return new Measure(Type.GALLON.getInBaseUnits(quantity));
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


    public Measure add(Measure that) {
        return new Measure(this.totalCapacity+that.totalCapacity);
    }
}
