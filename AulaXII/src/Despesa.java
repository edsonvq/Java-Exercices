import javax.swing.JOptionPane;


public class Despesa
{
	private String descricao;
	protected double valortotal;
	private double quantidade;
	

	
	public Despesa(String descricao, double valortotal, double quantidade) {
		super();
		this.descricao = descricao;
		this.valortotal = valortotal;
		this.quantidade = quantidade;
	}

	public Despesa(String descricao, double valortotal) {
		super();
		this.descricao = descricao;
		this.valortotal = valortotal;
	}

	public Despesa()
	{
		this("",0,0);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValortotal() {
		return valortotal;
	}

	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public void cadastrarDespesa()
	{
		setQuantidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de refeições:")));
	}
	
	public void calcularDespesa()
	{
		valortotal = quantidade * 18;
	}
}
