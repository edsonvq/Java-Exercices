import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Custos {
	private double totalPercurso;
	
	public double getTotalPercurso() {
		return totalPercurso;
	}
	public Custos()
	{
		this(0);
	}
	public void setTotalPercurso(double totalPercurso) {
		this.totalPercurso = totalPercurso;
	}
	public Custos(double totalPercurso) {
		super();
		this.totalPercurso = totalPercurso;
	}
	
	DecimalFormat df = new DecimalFormat("###,##0.00");

	public double calcualarviagem(Percurso p){
		totalPercurso = p.getKmpercorrido() + p.getValorcombustivel() + p.getValorpedagi();	
		JOptionPane.showMessageDialog(null, "Valor da viagem: R$ " + df.format (getTotalPercurso()));
		return getTotalPercurso();
	}
	
}
