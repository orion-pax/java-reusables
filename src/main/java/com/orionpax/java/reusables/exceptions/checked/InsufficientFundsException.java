package com.orionpax.java.reusables.exceptions.checked;

public class InsufficientFundsException extends Exception{
    private Number amount;

    public InsufficientFundsException(Number amount) {
        this.amount = amount;
    }

    public Number getAmount() {
        return amount;
    }
}
