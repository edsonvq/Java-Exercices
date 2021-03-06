import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Produto {
	private int id, estoquedisponivel;
	private double precounitario, vt;
	private String descricao, nome;
	private boolean b1;

	public Produto(int id, int estoquedisponivel, double precounitario,
			String descricao, String nome) {
		super();
		this.id = id;
		this.estoquedisponivel = estoquedisponivel;
		this.precounitario = precounitario;
		this.descricao = descricao;
		this.nome = nome;
	}
	public Produto()
	{
		this(0,0,0,"","");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstoquedisponivel() {
		return estoquedisponivel;
	}
	public void setEstoquedisponivel(int estoquedisponivel) {
		this.estoquedisponivel = estoquedisponivel;
	}
	public double getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(double precounitario) {
		this.precounitario = precounitario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVt() {
		return vt;
	}
	public void setVt(double vt) {
		this.vt = vt;
	}

	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}


	DecimalFormat df = new DecimalFormat("###,##0.00");

	public void cadastrarProduto()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
		setDescricao(JOptionPane.showInputDialog("Digite a descri??o do produto"));
		setEstoquedisponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque disponivel do produto")));
		setPrecounitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre?o do produto")));
	}
	public void listaProduto(){
		JOptionPane.showMessageDialog(null,"Informa??es do Produto" +
				                    "\nNome do produto: " + getNome() +
									"\nDescri??o do produto: " +getDescricao() +
									"\nEstoque dispon?vel do produto: " +getEstoquedisponivel()+
		                            "\nPre?o unit?rio do produto: R$ " + df.format(getPrecounitario()));
	}
	public boolean ComfirmarPedido(int qtd)
	{
		if (qtd <= estoquedisponivel)
		{
			JOptionPane.showMessageDialog(null,"Estoque disponivel!");
			b1 =  true;
		}

		else if (qtd > estoquedisponivel)
		{
			JOptionPane.showMessageDialog(null,"Quantidade desejada do produto indispon?vel!");
			b1 = false;
		}
		return b1;
	}
	
	public double pedido(int qtd)
	{
     vt = qtd*precounitario;
     return getVt();
	}
	
	public void vender(int qtd)
	{
	if (qtd <= estoquedisponivel){
	estoquedisponivel = estoquedisponivel - qtd;
		JOptionPane.showMessageDialog(null,"Venda realizada com sucesso!");
	}}
	
}
