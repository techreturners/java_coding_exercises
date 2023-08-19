package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {

        return switch (iceCreamFlavour) {
            case "Pistachio" : yield 0;
            case "Raspberry Ripple" : yield 1;
            case "Vanilla" : yield 2;
            case "Mint Chocolate Chip" : yield 3;
            case "Chocolate" : yield 4;
            case "Mango Sorbet" : yield 5;
            default:
                throw new IllegalStateException("Unexpected value: " + iceCreamFlavour);
        };

    }

    String[] iceCreamFlavours() {

        return new String[] { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

    }

}
