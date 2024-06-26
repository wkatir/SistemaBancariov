/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancariov;

/**
 *
 * @author Wilmer Salazar
 */

/**
 * Clase que representa una cuenta bancaria.
 */

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    
      /**
     * Crea una nueva cuenta con el número de cuenta, saldo inicial y cliente especificados.
     *
     * @param numeroCuenta el número de cuenta
     * @param saldoInicial el saldo inicial de la cuenta
     * @param cliente      el cliente asociado a la cuenta
     */
    
    public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return el número de cuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
      /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta
     */
    
    public double getSaldo() {
        return saldo;
    }

    /**
    * Obtiene el nombre del cliente asociado a este objeto.
    *
    * @return El nombre del cliente.
    */
    
    public String getNombre() {
        return cliente.getNombre();
    }
    
    
        /**
     * Deposita la cantidad especificada en la cuenta.
     *
     * @param cantidad la cantidad a depositar
     */
    
    public void depositar(double cantidad){
        if( cantidad >= 1 && cantidad <= 4999){
            saldo += cantidad;
        }else{
            System.out.println("La cantidad mínima a depositar es de $1.00 y no puede exceder $4999.00 .");
        }
    }
    
      /**
     * Retira la cantidad especificada de la cuenta si hay saldo suficiente.
     *
     * @param cantidad la cantidad a retirar
     * @return true si se pudo retirar la cantidad, false en caso contrario
     */
    
    public boolean retirar(double cantidad){
        if(saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
