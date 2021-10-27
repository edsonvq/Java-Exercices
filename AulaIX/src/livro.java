import javax.swing.JOptionPane;


public class livro extends Produto
{
	private String autor, editora, edicao;

	public livro(String descricao, String genero, int estoqueDisponivel,
			double precoCusto, String autor, String editora, String edicao) {
		super(descricao, genero, estoqueDisponivel, precoCusto);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}
	
	public livro()
	{
		this("","",0,0,"","","");
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public void listarProduto()
	{
		JOptionPane.showMessageDialog(null, "Descrição: " + getDescricao() +
				"\nGênero: " + getGenero() + "\nEstoque Disponível: " + getEstoqueDisponivel() +
				"\nPreço de Custo: R$ " + getPrecoCusto() + "\nAutor: " + getAutor() +
				"\nEditora: " + getEditora() + "\nEdição: " + getEdicao());
	}
}
