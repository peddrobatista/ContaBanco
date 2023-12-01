package com.peddrobatista.utils;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double initialDeposit) {
        this.numero = numero;
        this.titular = titular;
        depositar(initialDeposit);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void retirar(double quantia) {
        saldo -= quantia + 5.0;
    }

    public String toString() {
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: "
                + String.format("%.2f", saldo);
    }
}
