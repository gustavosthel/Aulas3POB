package model;

public class CaixaEletronico {
	
	private double saldo;
	
	public CaixaEletronico() {
	}

	public CaixaEletronico(double saldo) {
		super();
		this.saldo = 2000.00;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. O saque deve ser maior que R$ 0,00.");
            return;
        }
        
        if (valor % 10 != 0) {
            System.out.println("Erro: O valor do saque deve ser múltiplo de R$ 10,00.");
            return;
        }
        
        if (valor > saldo) {
            System.out.println("Saldo insuficiente no caixa eletrônico.");
            return;
        }
        
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
    }

    public void exibirSaldo() {
        System.out.printf("Saldo disponível no caixa: R$ %.2f\n", saldo);
    }

}
