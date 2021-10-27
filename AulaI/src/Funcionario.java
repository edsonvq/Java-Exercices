import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private String idade;
	private String cargo;
	private String salariobr;
	private double salarioli;
	private double grat;
	private double desc;
	
	public Funcionario(String nome, String cargo, String idade, String salariobr, double salarioli) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salariobr = salariobr;
		this.salarioli = salarioli;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalariobr() {
		return salariobr;
	}
	public void setSalariobr(String salariobr) {
		this.salariobr = salariobr;
	}
	public double getSalarioli() {
		return salarioli;
	}
	public void setSalarioli(double salarioli) {
		this.salarioli = salarioli;
	}
	public double getGrat() {
		return grat;
	}
	public void setGrat(double grat) {
		this.grat = grat;
	}
	public double getDesc() {
		return desc;
	}
	public void setDesc(double desc) {
		this.desc = desc;
	}
	public void entrardados()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome"));
		setIdade(JOptionPane.showInputDialog("Digite a idade"));
		setCargo(JOptionPane.showInputDialog("Digite o cargo"));
		setSalariobr(JOptionPane.showInputDialog("Digite o salario bruto"));
	}
	public void mostrardados()
	{
		JOptionPane.showConfirmDialog (null, " \n nome: " + getNome()+
		 									 "\n Idade: " + getIdade()+
		 									 "\n Cargo:  " + getCargo()+
		 									 "\n Salario Bruto: "  + getSalariobr()
		
		);
	}
	public void calculos()
	{
		double salariobrs = Double.parseDouble(salariobr);
		grat= salariobrs*2.95/100;
		desc= salariobrs*1.12/100;
		salarioli= salariobrs+grat-desc;
	}
	public void resultado()
	{
		JOptionPane.showConfirmDialog (null, " \n nome: " + getNome()+
				  							 "\n Idade: " + getIdade()+
				  							 "\n Cargo: " + getCargo()+
				  							 "\n Salario Bruto: "  + getSalariobr()+
				  							 "\n Desconto: "  + getDesc()+
				  							 "\n Gratificação: "  + getGrat()+
				  							 "\n Salario Liquido: "  + getSalarioli()

);	
	}
	
}
