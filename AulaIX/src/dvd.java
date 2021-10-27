import javax.swing.JOptionPane;


public class dvd extends Produto
{
	private String diretor, duracao, censura;

	public dvd(String descricao, String genero, int estoqueDisponivel,
			double precoCusto, String diretor, String duracao, String censura) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}
	
	public dvd()
	{
		this("","",0,0,"","","");
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}
	
	public void listarProduto()
	{
		JOptionPane.showMessageDialog(null, "Descrição: " + getDescricao() +
				"\nGênero: " + getGenero() + "\nEstoque Disponível: " + getEstoqueDisponivel() +
				"\nPreço de Custo: R$ " + getPrecoCusto() + "\nAutor: " + getDiretor() +
				"\nEditora: " + getDuracao() + "\nEdição: " + getCensura());
	}
}
