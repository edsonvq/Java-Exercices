import javax.swing.JOptionPane;


public class Cliente
{
	private Integer id;
	private String nome;
	private String endereco;
	private String email;
	private Integer rendamensal;
	private double limitecredito;
	


	public Cliente(Integer id, String nome, String endereco, String email,
			Integer rendamensal, double limitecredito) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.rendamensal = rendamensal;
		this.limitecredito = limitecredito;
	}
	public Cliente()
	{
		this(0,"","","",0,0);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRendamensal() {
		return rendamensal;
	}

	public void setRendamensal(Integer rendamensal) {
		this.rendamensal = rendamensal;
	}

	public double getLimitecredito() {
		return limitecredito;
	}

	public void setLimitecredito(double limitecredito) {
		this.limitecredito = limitecredito;
	}

	public void entradaDados()
	{
		setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Cliente")));
		setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
		setEndereco(JOptionPane.showInputDialog("Digite o endereco do Cliente"));
		setEmail(JOptionPane.showInputDialog("Digite o e-mail do Cliente"));
		setRendamensal(Integer.parseInt(JOptionPane.showInputDialog("Digite a renda mensal do Cliente")));
	}
	
	public void calcularValores()
	{	
		limitecredito = (getRendamensal()*53.28)/100;
		JOptionPane.showMessageDialog(null,
				"Limite de Credito: R$ " + getLimitecredito());

	}
	public void mostrarDados()
	{
		JOptionPane.showMessageDialog(null, "Cliente: " + getNome() +
									"\nId: " + getId() +
									"\nEndereço: " + getEndereco() +
									"\nEmail: " + getEmail() +
									"\nRenda mensal: R$ " + getRendamensal() +
									"\nLimite de Credito: R$ " + getLimitecredito());
	}

}