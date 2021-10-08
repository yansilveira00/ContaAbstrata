/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
*
* @author silva-muzime
 */
public abstract class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeCorrentista;
    
     /**
     * @param valor   
     */
    public abstract void sacar(double valor);
    
     /**
     * @param valor
     */
    public abstract void depositar(double valor);
    
    public int getNumeroConta() {
        return numeroConta;
    }
    

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    /**
     * Metodo que executa a transferencia do valor de conta para outra conta
     * @param valor valor a transferir
     * @param conta conta destino
     */
    public void transferir(double valor, ContaBancaria conta){
        if(this instanceof ContaCorrente){
            ContaCorrente cc = ((ContaCorrente)this);
            boolean condicao=(this.getSaldo() - valor - cc.getTaxaDeOperacao()) > 0;
            if(condicao){
                cc.sacar(valor);
                conta.depositar(valor);                
            }            
        }else{
            ContaPoupanca cp = ((ContaPoupanca)this);
            boolean condicao = (cp.getSaldo()-valor) >= cp.getLimite();
            if(condicao){
                cp.sacar(valor);
                conta.depositar(valor);                 
            }
        }
        
        
    }
    
    
    
}
