import javax.swing.JOptionPane;


public class Transporte extends Despesa
{
	private double kmPercorridos, valorPedagios;


	
	public Transporte(String descricao, double valortotal,
			double kmPercorridos, double valorPedagios) {
		super(descricao, valortotal);
		this.kmPercorridos = kmPercorridos;
		this.valorPedagios = valorPedagios;
	}


	public Transporte()
	{
		this("",0,0,0);
	}
	
	public double getKmPercorridos() {
		return kmPercorridos;
	}


	public void setKmPercorridos(double kmPercorridos) {
		this.kmPercorridos = kmPercorridos;
	}


	public double getValorPedagios() {
		return valorPedagios;
	}


	public void setValorPedagios(double valorPedagios) {
		this.valorPedagios = valorPedagios;
	}

	public void cadastrarDespesa()
	{
		setKmPercorridos(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem percorrida:")));
		setValorPedagios(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos pedágios:")));
	}
	public void calcularDespesa()
	{
		valortotal = kmPercorridos + valorPedagios;
	}
	
	public void listarDespesa()
	{
		JOptionPane.showMessageDialog(null, "Despesa: \n" +
				"\nQuilometros percorridos: " + getKmPercorridos()+
				"\nValor dos pedágios: R$ " + getValorPedagios()+
				"\nValor total:  R$" + getValortotal());
	}
}
