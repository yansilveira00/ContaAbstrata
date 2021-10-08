/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        ContaCorrente  cc = new ContaCorrente();
        ContaPoupanca  cp = new ContaPoupanca();
        Scanner leitura = new Scanner(System.in);
        int op;
        do{
            System.out.println("----- Conta Bancaria -----");
            System.out.println("[1] Criar conta");
            System.out.println("[2] Depositar valor");
            System.out.println("[3] Sacar valor");
            System.out.println("[4] Relatório");
            System.out.println("[0] Sair");
            leitura.nextLine();
            op = leitura.nextInt();
            switch(op){
                
                case 1:
                    System.out.println("Digite o nome do correntista: ");
                    cc.setNomeCorrentista("Yan");
                    
                    System.out.println("Digite o número da conta: ");
                    cc.setNumeroConta(2021);
                    cc.setNumeroConta(2022);
                    System.out.println("Digite o saldo da conta: ");
                    cp.depositar(1500);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    cc.depositar(200);
                break;
                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    cp.sacar(1450);
                break;
                case 4:
                    Relatorio r = new Relatorio();
                    r.gerarRelatorio(cp);
                break;
            }
        }while(op != 0);
    }   
}