import javax.swing.JOptionPane;

public class Caixa {
	private double valorTotal;

		public double totalizarComanda(Comanda c) {
			JOptionPane.showMessageDialog(null, "Você fechou a mesa. Obrigado e volte sempre! :)");
			valorTotal = c.getValorConsumo() + c.getValorCouvert() + c.getValorEstacionamento() - c.getValorDescontoPromocional();
			return valorTotal;
		}
}
