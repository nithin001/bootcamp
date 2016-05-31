package com.thoughtworks;

/**
 *
 */
public class Probability {
    private double chance;

    public Probability(double chance) {
        this.chance = chance;
    }

    public Probability negate() {
        return new Probability(1 - chance);
    }

    public Probability and(Probability that) {
        return new Probability(this.chance * that.chance);
    }

    public Probability or(Probability that) {
        return new Probability(chance + that.chance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.chance, chance) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(chance);
        return (int) (temp ^ (temp >>> 32));
    }
}
