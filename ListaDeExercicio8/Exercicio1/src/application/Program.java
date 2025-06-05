package application;

import interfac.Pagamento;
import model.BoletoBancario;
import model.CartaoCredito;

public class Program {

	public static void main(String[] args) {
		
		Pagamento cartao = new CartaoCredito();
		Pagamento boleto = new BoletoBancario();
        
        cartao.realizarPagamento(150.75);
        boleto.realizarPagamento(299.90);

	}

}
