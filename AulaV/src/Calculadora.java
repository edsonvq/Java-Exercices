import javax.swing.JOptionPane;


public class Calculadora
{
	private double n1, n2, r;

	public Calculadora(double n1, double n2, double r) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.r = r;
	}
	
	public Calculadora()
	{
		this(0,0,0);
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public void somar()
	{
		setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N1")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N2")));
		setR(getN1() + getN2());
		JOptionPane.showMessageDialog(null, "Resultado da Soma: " + getR());
	}
	
	public void subtrair(double a, double b)
	{
		setN1(a);
		setN2(b);
		setR(getN1() - getN2());
		JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + getR());
	}
	
	public double multiplicar()
	{
		setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N1")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N2")));
		setR(getN1() * getN2());
		return getR();
	}
	
	public double dividir(double a, double b)
	{
		setN1(a);
		setN2(b);
		setR(getN1() / getN2());
		return getR();
	}
}
