package com.mycompany.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        String payment = "Credit Card";
        switch (payment) {
            case "Bitcoin":
                context.setStrategy(new Bitcoin());
                break;
            case "Credit Card":
                context.setStrategy(new CreditCard());
                break;
            case "PayPal":
                context.setStrategy(new PayPal());
                break;
        }
        System.out.println(context.execute());
    }
}
