package Exercicios_fixação_03;

class CurrencyConverter {
    double dollarPrice;
    double amountDollars;

    double amountReaisWithoutTax(){
        return dollarPrice * amountDollars;
    }

    double amountReais(){
        return amountReaisWithoutTax() * 1.06;
    }
}
