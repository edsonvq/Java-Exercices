import javax.swing.JOptionPane;


public class Automovel
{
	private String nomeAutomovel;
	private double precoFabrica;
	private double porcentagemRevendedor;
	private double valorImposto;
	private double precoFinal;
	
	public Automovel(String nomeAutomovel, double precoFabrica,
			double porcentagemRevendedor, double valorImposto, double precoFinal) {
		super();
		this.nomeAutomovel = nomeAutomovel;
		this.precoFabrica = precoFabrica;
		this.porcentagemRevendedor = porcentagemRevendedor;
		this.valorImposto = valorImposto;
		this.precoFinal = precoFinal;
	}
	
	public Automovel()
	{
		this("",0,0,0,0);
	}

	public String getNomeAutomovel() {
		return nomeAutomovel;
	}

	public void setNomeAutomovel(String nomeAutomovel) {
		this.nomeAutomovel = nomeAutomovel;
	}

	public double getPrecoFabrica() {
		return precoFabrica;
	}

	public void setPrecoFabrica(double precoFabrica) {
		this.precoFabrica = precoFabrica;
	}

	public double getPorcentagemRevendedor() {
		return porcentagemRevendedor;
	}

	public void setPorcentagemRevendedor(double porcentagemRevendedor) {
		this.porcentagemRevendedor = porcentagemRevendedor;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public void entradaDados()
	{
		setNomeAutomovel(JOptionPane.showInputDialog("Digite o Nome do Automovel"));
		setPrecoFabrica(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço de Fábrica")));
	}
	
	public void calcularValores()
	{
		setPorcentagemRevendedor(getPrecoFabrica() * 0.23);
		setValorImposto(getPrecoFabrica() * 0.115);
		setPrecoFinal(getPrecoFabrica() + getPorcentagemRevendedor() + getValorImposto());
		JOptionPane.showMessageDialog(null, "Porcentagem do Revendedor: R$ " + getPorcentagemRevendedor() +
								"\nValor do Imposto: R$ " + getValorImposto() +
								"\nPreço Final do Automóvel: R$ " + getPrecoFinal());
	}
	
	public void mostrarDados()
	{
		JOptionPane.showMessageDialog(null, "Nome do Automóvel: " + getNomeAutomovel() +
				"\nPreço de Fábrica: R$ " + getPrecoFabrica() +
				"\nPorcentagem do Revendedor: R$ " + getPorcentagemRevendedor() +
				"\nValor do Imposto: R$ " + getValorImposto() +
				"\nPreço Final do Automóvel: R$ " + getPrecoFinal());
	}
}