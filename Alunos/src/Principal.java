import javax.swing.JOptionPane;
public class Principal
{
	public static void main(String[] args)
	{
		Alunos Obj1 = new Alunos();	
		ControleAlunos Obj2 = new ControleAlunos();
		int opcao;
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Cadastrar aluno " +
					"\n2 - Apresentar aluno " +
					"\n3 - Verificar situação do aluno " +
					"\n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				Obj1.cadastrarAlunos();
			break;
			
			case 2:
				Obj1.listarAluno();
			break;
			
			case 3:
				Obj2.verificarSituacao(Obj1);
			break;

			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado....");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!!!!");
			break;
			}
			
		}while(opcao!=0);

	}

}