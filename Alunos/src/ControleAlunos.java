import javax.swing.JOptionPane;

public class ControleAlunos {
	private double MF;

		public void verificarSituacao(Alunos a) {
			MF = (a.getN1() + a.getN2() + a.getN3() + a.getN4())/4;
			if (MF >= 7){
				JOptionPane.showMessageDialog(null, "Situação do aluno \n"+
						"\nNome do aluno: " + a.getNome() +
						"\nMédia final: " + MF +
						"\nAluno aprovado! :D ");
				}else{
					JOptionPane.showMessageDialog(null, "Situação do aluno \n"+
							"\nNome do aluno: " + a.getNome() +
							"\nMédia final: " + MF +
							"\nAluno reprovado! :( ");
				}
		}
}