package model;

public class ContaBancaria {
	
	private String titular;
	private double  saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
		} else {
            System.out.println("Valor inválido para depósito.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0) {
			if (saldo >= valor) {
				saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
			} else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
		} else {
            System.out.println("Valor inválido para saque.");
		}
	}
	
	public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f\n", titular, saldo);
	}
	
	

}
