import javax.swing.JOptionPane;


public class Vendedor {
	private double sb, sl, vv, com;
	private String nome;
	public Vendedor(double sb, double sl, double vv, double com, String nome) {
		super();
		this.sb = sb;
		this.sl = sl;
		this.vv = vv;
		this.com = com;
		this.nome = nome;
	}
	public Vendedor()
	{
		this(0,0,0,0,"");
	}
	public double getSb() {
		return sb;
	}
	public void setSb(double sb) {
		this.sb = sb;
	}
	public double getSl() {
		return sl;
	}
	public void setSl(double sl) {
		this.sl = sl;
	}
	public double getVv() {
		return vv;
	}
	public void setVv(double vv) {
		this.vv = vv;
	}
	public double getCom() {
		return com;
	}
	public void setCom(double com) {
		this.com = com;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void entradaDados()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do vendedor"));
		setSb(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto do vendedor")));
	}
	public double comissao(double V)
	{
		setVv(V);
			setCom((getVv()*23.5)/100);
			return getCom();
		}
	public void mostrarDados()
	{
		setSl(getCom()+getSb());
		JOptionPane.showMessageDialog(null, "Vendedor: " + getNome() +
									"\nValor vendido: R$ " + getVv() +
									"\nSalário bruto: R$ " + getSb() +
									"\nSalário líquido: R$ " + getSl());
	}
}
