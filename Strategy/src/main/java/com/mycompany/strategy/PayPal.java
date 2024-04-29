package com.mycompany.strategy;

public class PayPal implements PaymentStrategy {

    @Override
    public String pay() {
        return "Pagado con PayPal";
    }
    
}
