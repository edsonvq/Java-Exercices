import javax.swing.JOptionPane;


public class Funcionario
{
	private String nome;
	private Integer idade;
	private String cargo;
	private double salariobruto;
	private double salarioli;
	private double valorinss;
	private double valorir;
	
	public Funcionario(String nome, Integer idade, String cargo,
			double salariobruto, double salarioli, double valorinss, double valorir) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salariobruto = salariobruto;
		this.salarioli = salarioli;
		this.valorinss = valorinss;
		this.valorir = valorir;
	}
	
	public Funcionario()
	{
		this("",0,"",0,0,0,0);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalariobruto() {
		return salariobruto;
	}

	public void setSalariobruto(double salariobruto) {
		this.salariobruto = salariobruto;
	}

	public double getSalarioli() {
		return salarioli;
	}

	public void setSalarioli(double salarioli) {
		this.salarioli = salarioli;
	}

	public double getValorinss() {
		return valorinss;
	}

	public void setValorinss(double valorinss) {
		this.valorinss = valorinss;
	}

	public double getValorir() {
		return valorir;
	}

	public void setValorir(double valorir) {
		this.valorir = valorir;
	}

	public void entradaDados()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do Funcionario"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Funcionario")));
		setCargo(JOptionPane.showInputDialog("Digite o cargo do Funcionario "));
		setSalariobruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario bruto do Funcionario")));
	}
	
	public void calcularValores()
	{
		double gratificacao;
		gratificacao = getSalariobruto() * 0.0295;
		
		if (getSalariobruto() <= 2500)
		{
			setValorinss(getSalariobruto() * 0.055);
			setValorir(getSalariobruto() * 0.075);
		}
		else
			if (getSalariobruto() <= 3750.50)
			{
				setValorinss(getSalariobruto() * 0.073);
				setValorir(getSalariobruto() * 0.0915);
			}
			else
				if (getSalariobruto() <= 5213.93)
				{
					setValorinss(getSalariobruto() * 0.0925);
					setValorir(getSalariobruto() * 0.11);
				}
				else
					{
						setValorinss(518.23);
						setValorir(getSalariobruto() * 0.275);
					}		
		
		setSalarioli(getSalariobruto() + gratificacao - valorinss - valorir);
		
		JOptionPane.showMessageDialog(null, "Gratificação: R$ " + gratificacao +
				"\nINSS: R$ " + getValorinss() + "\nIR: R$ " + getValorir() +
				"\nSalário Liquido: R$ " + getSalarioli());

	}
	public void mostrarDados()
	{
		JOptionPane.showMessageDialog(null, "Funcionário: " + getNome() +
									"\nCargo: " + getCargo() +
									"\nIdade: " + getIdade() +
									"\nSalário Bruto: R$ " + getSalariobruto() +
									"\nINSS: R$ " + getValorinss() +
									"\nIR: R$ " + getValorir() +
									"\nSalário Liquido: R$ " + getSalarioli());
	}

}