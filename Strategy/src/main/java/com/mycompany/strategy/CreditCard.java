package com.mycompany.strategy;

public class CreditCard implements PaymentStrategy{

    @Override
    public String pay() {
       return "Pagado con Tarjeta de Credito";
    }
     
}
