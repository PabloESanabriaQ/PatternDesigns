package com.mycompany.strategy;

public class Context {
    
    private PaymentStrategy strategy;
    
    public Context(PaymentStrategy strategy){
       this.strategy = strategy;
    }
    public Context(){
        
    }
    public String execute(){
        return strategy.pay();
    }
     public void setStrategy(PaymentStrategy strategy){
       this.strategy = strategy;
    }
}
