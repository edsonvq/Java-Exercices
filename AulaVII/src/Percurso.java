import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Percurso{
	private double kmpercorrido, valorcombustivel, valorpedagi, hue;
	
	public Percurso(double kmpercorrido, double valorcombustivel,
			double valorpedagi, double hue) {
		super();
		this.kmpercorrido = kmpercorrido;
		this.valorcombustivel = valorcombustivel;
		this.valorpedagi = valorpedagi;
		this.hue = hue;
	}
	public Percurso()
	{
		this(0,0,0,0);
	}
	public double getKmpercorrido() {
		return kmpercorrido;
	}

	public void setKmpercorrido(double kmpercorrido) {
		this.kmpercorrido = kmpercorrido;
	}

	public double getValorcombustivel() {
		return valorcombustivel;
	}

	public void setValorcombustivel(double valorcombustivel) {
		this.valorcombustivel = valorcombustivel;
	}

	public double getValorpedagi() {
		return valorpedagi;
	}

	public void setValorpedagi(double valorpedagi) {
		this.valorpedagi = valorpedagi;
	}

	public double getHue() {
		return hue;
	}

	public void setHue(double hue) {
		this.hue = hue;
	}
	
	DecimalFormat df = new DecimalFormat("###,##0.00");
	
	public void cadastrarPercurso()
	{
		setKmpercorrido(Double.parseDouble(JOptionPane.showInputDialog("Digite o KM percorrido")));
		setValorcombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do combustivel")));
		setValorpedagi(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedágio")));
	}
	public void listaPercurso(double hue2){
		hue = hue2;
		JOptionPane.showMessageDialog(null,"Informações do Percurso" +
				                    "\nKM percorrido: " + getKmpercorrido() +
									"\nValor do combustivel: R$ " + df.format(getValorcombustivel()) +
									"\nValor do pedagio: R$ " + df.format(getValorpedagi())+
		                            "\nValor total: R$ " + df.format(getHue()));
	}
}
