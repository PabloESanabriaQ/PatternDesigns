package com.mycompany.strategy;

public class Bitcoin implements PaymentStrategy {

    @Override
    public String pay() {
        return "Pagado con BTC";
    }
    
        
}
