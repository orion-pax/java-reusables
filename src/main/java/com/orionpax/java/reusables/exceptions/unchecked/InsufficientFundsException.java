package com.orionpax.java.reusables.exceptions.unchecked;

public class InsufficientFundsException extends RuntimeException{
    private Number amount;

    public InsufficientFundsException(Number amount) {
        this.amount = amount;
    }

    public Number getAmount() {
        return amount;
    }
}
