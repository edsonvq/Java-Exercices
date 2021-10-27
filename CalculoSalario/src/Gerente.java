import javax.swing.JOptionPane;


public class Gerente extends Funcionario
{
	private double gratificacao;

	public Gerente(String nome, String cpf, double sb, double sf, double vb,
			double gratificacao) {
		super(nome, cpf, sb, sf, vb);
		this.gratificacao = gratificacao;
	}

	public Gerente()
	{
		this("","",0,0,0,0);
	}


	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	public void calcularSalarioFinal()
	{
		setGratificacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da gratifica��o:")));
	}
	
	public void apresentarSalario()
	{
		sf = sb + gratificacao + vb; 
		JOptionPane.showMessageDialog(null, "Resultados: \n" +
				"\nSal�rio base: " + getSb()+
				"\nValor da bonifica��o: R$ " + getVb()+
				"\nValor da gratifica��o: R$ " + getGratificacao()+
				"\nSal�rio total:  R$" + getSf());
	}
}
