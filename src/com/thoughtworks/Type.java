package com.thoughtworks;

/**
 * Created by gnithin on 5/31/16.
 */
public enum Type {

    TEASPOON(CONSTANTS.TEASPOON_FACTOR), TABLESPOON(CONSTANTS.TABLESPOON_FACTOR), OUNCE(CONSTANTS.OUNCE_FACTOR),
    CUP(CONSTANTS.CUP_FACTOR), PINT(CONSTANTS.PINT_FACTOR), QUART(CONSTANTS.QUART_FACTOR), GALLON(CONSTANTS.GALLON_FACTOR);
    private int factor;

    Type(int i) {
        this.factor = i;
    }

    public int getInBaseUnits(int quantity) {
        return quantity * factor;
    }

    private static class CONSTANTS {
        private static final int TEASPOON_FACTOR = 1;
        private static final int TABLESPOON_FACTOR = 3 * TEASPOON_FACTOR;
        private static final int OUNCE_FACTOR = TABLESPOON_FACTOR * 2;
        private static final int CUP_FACTOR = OUNCE_FACTOR * 8;
        private static final int PINT_FACTOR = CUP_FACTOR * 2;
        private static final int QUART_FACTOR = PINT_FACTOR * 2;
        private static final int GALLON_FACTOR = QUART_FACTOR * 4;
    }
}
