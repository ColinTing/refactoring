package com.colinting.refactoring.videostore;

/**
 * @author Colin Ting
 * @date 2021年09月12日 15:03
 * Price抽象类
 */

public abstract class Price {
    abstract int getPriceCode();
}

class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}

class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}

class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
