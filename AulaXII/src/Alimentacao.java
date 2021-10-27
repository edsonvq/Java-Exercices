import javax.swing.JOptionPane;


public class Alimentacao extends Despesa
{
	private String nomeRestaurante;
	
	public Alimentacao(String descricao, double valortotal, double quantidade,
			String nomeRestaurante) {
		super(descricao, valortotal, quantidade);
		this.nomeRestaurante = nomeRestaurante;
	}

	public Alimentacao()
	{
		this("",0,0,"");
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	
	public void listarDespesa()
	{
		JOptionPane.showMessageDialog(null, "Despesa: \n" +
				"\nRefeições: " + getQuantidade()+
				"\nValor total das refeições: R$ " + getValortotal());
	}
}
