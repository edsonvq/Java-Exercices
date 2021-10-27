import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Comanda{
	private int id;
	private double valorConsumo, valorCouvert;
	private double valorDescontoPromocional, valorTotal, valorEstacionamento;

	public Comanda(int id, double valorConsumo, double valorCouvert,
			double valorDescontoPromocional, double valorTotal,
			double valorEstacionamento) {
		this.id = id;
		this.valorConsumo = valorConsumo;
		this.valorCouvert = valorCouvert;
		this.valorDescontoPromocional = valorDescontoPromocional;
		this.valorTotal = valorTotal;
		this.valorEstacionamento = valorEstacionamento;
	}
	public Comanda()
	{
		this(0,0,0,0,0,0);
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getValorConsumo() {
		return valorConsumo;
	}


	public void setValorConsumo(double valorConsumo) {
		this.valorConsumo = valorConsumo;
	}


	public double getValorCouvert() {
		return valorCouvert;
	}


	public void setValorCouvert(double valorCouvert) {
		this.valorCouvert = valorCouvert;
	}


	public double getValorDescontoPromocional() {
		return valorDescontoPromocional;
	}


	public void setValorDescontoPromocional(double valorDescontoPromocional) {
		this.valorDescontoPromocional = valorDescontoPromocional;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public double getValorEstacionamento() {
		return valorEstacionamento;
	}
	public void setValorEstacionamento(double valorEstacionamento) {
		this.valorEstacionamento = valorEstacionamento;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	DecimalFormat df = new DecimalFormat("###,##0.00");
	
	public void lancarGastos()
	{
		id = getId() + 1;
		setValorConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite valor consumido")));
		setValorEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Digite valor do estacionamento")));
		setValorCouvert(Double.parseDouble(JOptionPane.showInputDialog("Digite valor do Couvert")));
	}
	public void verificarPromocao(){
		if (valorConsumo >= 120){
			JOptionPane.showMessageDialog(null, "Você terá direito a desconto promocional! :D");
			valorDescontoPromocional = (getValorConsumo()*5)/100;
			}else{
			JOptionPane.showMessageDialog(null, "Você não atingiu valor necessário para ganhar desconto promocional :(");
			}
				
	}
	
	public void listarComanda(double r)
	{
		valorTotal = r;
		JOptionPane.showMessageDialog(null, "Comanda: "+
				"\nID Comanda: " + getId() +
				"\nValor consumido: " + df.format(getValorConsumo()) +
				"\nValor do estacionamento: " + df.format(getValorEstacionamento()) +
				"\nValor Couvert: R$ " + df.format(getValorCouvert()) +
				"\nValor desconto promocional: R$ " + df.format(getValorDescontoPromocional()) +
				"\nValor total: R$ " + df.format(getValorTotal()));
	}
	
}
