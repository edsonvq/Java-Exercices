import javax.swing.JOptionPane;


public class Funcionario
{
	private String nome,cpf;
	protected double sb,sf,vb;

	public Funcionario(String nome, String cpf, double sb, double sf, double vb) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sb = sb;
		this.sf = sf;
		this.vb = vb;
	}

	public Funcionario()
	{
		this("","",0,0,0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSb() {
		return sb;
	}

	public void setSb(double sb) {
		this.sb = sb;
	}

	public double getSf() {
		return sf;
	}

	public void setSf(double sf) {
		this.sf = sf;
	}

	public double getVb() {
		return vb;
	}

	public void setVb(double vb) {
		this.vb = vb;
	}

	public void cadastrarFuncionario()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do funcuionário:"));
		setCpf(JOptionPane.showInputDialog("Digite o CPF do funcuionário:"));
		setSb(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário base:")));
	}
	
	public void calcularBonificacao()
	{ 
		vb = sf * 0.05;
	}
	public void calculofeito()
	{
		JOptionPane.showMessageDialog(null, "Calculos feitos com sucesso!");
	}
}
