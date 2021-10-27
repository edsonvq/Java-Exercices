import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Cliente{
	private int id;
	private String nome, email, endereco;
	private double rendamensal, limitecredito = 0, hue, i;
	private boolean b2;
	

	public Cliente(int id, String nome, String email, String endereco,
			double rendamensal, double limitecredito, double hue) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.rendamensal = rendamensal;
		this.limitecredito = limitecredito;
		this.hue = hue;
	}
	public Cliente()
	{
		this(0,"","","",0,0,0);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendamensal() {
		return rendamensal;
	}
	public void setRendamensal(double rendamensal) {
		this.rendamensal = rendamensal;
	}
	public double getLimitecredito() {
		return limitecredito;
	}
	public void setLimitecredito(double limitecredito) {
		this.limitecredito = limitecredito;
	}
	public double getHue() {
		return hue;
	}
	public void setHue(double hue) {
		this.hue = hue;
	}
	public double getI() {
		return i;
	}
	public void setI(double i) {
		this.i = i;
	}

	public boolean isB2() {
		return b2;
	}
	public void setB2(boolean b2) {
		this.b2 = b2;
	}



	DecimalFormat df = new DecimalFormat("###,##0.00");
	
	public void cadastrarCliente()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		setEmail(JOptionPane.showInputDialog("Digite o e-mail do cliente"));
		setEndereco(JOptionPane.showInputDialog("Digite o endereço do cliente"));
		setRendamensal(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal do cliente")));
	}
	public void listaCliente(){
		JOptionPane.showMessageDialog(null,"Informações do Cliente" +
				                    "\nNome do cliente: " + getNome() +
									"\nEmail do cliente: " +getEmail() +
									"\nEndereço do cliente: " +getEndereco()+
		                            "\nRenda mensal do cliente: R$ " + df.format(getRendamensal()));;
	}
	
	public void calcularLimiteCredito()
	{
		limitecredito = (getRendamensal()*12.5)/100;
		JOptionPane.showMessageDialog(null,
				"Limite de Credito: R$ " + getLimitecredito());
	}
	
	public boolean ComfirmarCompra(double valorcompra)
	{
    if (valorcompra <= limitecredito)
    {
     i = valorcompra;
     hue = limitecredito;
     limitecredito= limitecredito-valorcompra;
    	JOptionPane.showMessageDialog(null,"Informações do Limite de crédito" +
                "\nLimite de crédito anterior: " + getHue() +
				"\nValor da compra: " + getI() +
				"\nNovo limite de crédito: " + getLimitecredito());
     b2 = true;
    }
    else if (valorcompra > limitecredito)
    {
    	JOptionPane.showMessageDialog(null,"Limite de crédito do cliente insuficiente!");
     b2= false;
    }
	return b2;
}
}
