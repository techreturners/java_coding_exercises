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
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}
