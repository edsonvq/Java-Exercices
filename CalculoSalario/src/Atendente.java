import javax.swing.JOptionPane;


public class Atendente extends Funcionario
{
	private double ad;


	public Atendente(String nome, String cpf, double sb, double sf, double vb,
			double ad) {
		super(nome, cpf, sb, sf, vb);
		this.ad = ad;
	}

	public Atendente()
	{
		this("","",0,0,0,0);
	}

	public double getAd() {
		return ad;
	}

	public void setAd(double ad) {
		this.ad = ad;
	}

	public void calcularSalarioFinal()
	{
		setAd(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do adicional noturno:")));

		sf = sb + ad + vb; 
	}
	
	public void apresentarSalario()
	{
		JOptionPane.showMessageDialog(null, "Resultados: \n" +
				"\nSal�rio base: " + getSb()+
				"\nValor da bonifica��o: R$ " + getVb()+
				"\nValor do adicional noturno: R$ " + getAd()+
				"\nSal�rio total:  R$" + getSf());
	}
}