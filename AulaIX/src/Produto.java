import javax.swing.JOptionPane;


public class Produto
{
	private String descricao, genero;
	private int estoqueDisponivel;
	private double precoCusto;
	
	public Produto(String descricao, String genero, int estoqueDisponivel,
			double precoCusto) {
		super();
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
	}
	
	public Produto()
	{
		this("","",0,0);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public void comprar(int quantidade)
	{
		int estoqueAnterior = getEstoqueDisponivel();
		setEstoqueDisponivel(getEstoqueDisponivel() + quantidade);
		JOptionPane.showMessageDialog(null, "Estoque Anterior: " + estoqueAnterior +
				"\nQuantidade Comprada: " + quantidade + "\nEstoque Atual: " + getEstoqueDisponivel());
	}
	
	public void vender(int quantidade)
	{
		int estoqueAnterior = getEstoqueDisponivel();
		setEstoqueDisponivel(getEstoqueDisponivel() - quantidade);
		JOptionPane.showMessageDialog(null, "Estoque Anterior: " + estoqueAnterior +
				"\nQuantidade Vendida: " + quantidade + "\nEstoque Atual: " + getEstoqueDisponivel());
	}
}
