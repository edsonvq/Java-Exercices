import javax.swing.JOptionPane;


public class Vendedor extends Funcionario
{
	private double vc;
	

	public Vendedor(String nome, String cpf, double sb, double sf, double vb,
			double vc) {
		super(nome, cpf, sb, sf, vb);
		this.vc = vc;
	}

	public Vendedor()
	{
		this("","",0,0,0,0);
	}

	public double getVc() {
		return vc;
	}

	public void setVc(double vc) {
		this.vc = vc;
	}

	public void calcularSalarioFinal()
	{
		setVc(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da comissão:")));

		sf = sb + vc + vb; 
	}
	
	public void apresentarSalario()
	{
		JOptionPane.showMessageDialog(null, "Resultados: \n" +
				"\nSalário base: " + getSb()+
				"\nValor da bonificação: R$ " + getVb()+
				"\nValor da comissão: R$ " + getVc()+
				"\nSalário total:  R$" + getSf());
	}
}
