package com.chromis.pos.payment;

public class PaymentMpesa {
    private double amount;
    private String phone;
    public PaymentMpesa(double amount, String phone) { this.amount = amount; this.phone = phone; }
    public double getTotal() { return amount; }
    public String getPhone() { return phone; }
}
