import javax.swing.JOptionPane;


public class Alunos{
	private String Nome;
	private double N1, N2, N3, N4, MF;

	public Alunos(String nome, double n1, double n2, double n3, double n4,
			double mF) {
		Nome = nome;
		N1 = n1;
		N2 = n2;
		N3 = n3;
		N4 = n4;
		MF = mF;
	}
	public Alunos()
	{
		this("",0,0,0,0,0);
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getN1() {
		return N1;
	}
	public void setN1(double n1) {
		N1 = n1;
	}
	public double getN2() {
		return N2;
	}
	public void setN2(double n2) {
		N2 = n2;
	}
	public double getN3() {
		return N3;
	}
	public void setN3(double n3) {
		N3 = n3;
	}
	public double getN4() {
		return N4;
	}
	public void setN4(double n4) {
		N4 = n4;
	}
	public double getMF() {
		return MF;
	}
	public void setMF(double mF) {
		MF = mF;
	}
	public void cadastrarAlunos()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota")));
		setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota")));
		setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota")));
	}

	public void listarAluno()
	{
		JOptionPane.showMessageDialog(null, "Situação do aluno \n"+
				"\nNome do aluno: " + getNome() +
				"\nPrimeira nota: " + getN1() +
				"\nSegunda nota: " + getN2() +
				"\nTerceira nota: " + getN3() +
				"\nQuarta nota: " + getN4());
	}
	
}
