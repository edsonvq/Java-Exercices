import javax.swing.JOptionPane;


public class Diaria extends Despesa
{
	private double qntdDiaria;


	
	public Diaria(String descricao, double valortotal, double qntdDiaria) {
		super(descricao, valortotal);
		this.qntdDiaria = qntdDiaria;
	}

	public Diaria(double qntdDiaria) {
		super();
		this.qntdDiaria = qntdDiaria;
	}

	public Diaria()
	{
		this("",0,0);
	}
	
	public double getQntdDiaria() {
		return qntdDiaria;
	}

	public void setQntdDiaria(double qntdDiaria) {
		this.qntdDiaria = qntdDiaria;
	}

	public void cadastrarDespesa()
	{
		setQntdDiaria(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de diárias:")));
	}

	public void calcularDespesa()
	{
		valortotal = qntdDiaria * 50;
	}
	
	public void listarDespesa()
	{
		JOptionPane.showMessageDialog(null, "Despesa: \n" +
				"\nQuantidade de diárias: " + getQntdDiaria()+
				"\nValor das diárias: R$ 50"+
				"\nValor total:  R$" + getValortotal());
	}
}
