import javax.swing.JOptionPane;
public class Principal
{
	public static void main(String[] args)
	{
		Percurso objPercurso = new Percurso();	
		Custos objCusto = new Custos();
		int opcao;
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
					"\n1 - Cadastrar Percurso \n2 - Calcular Percurso \n3 - Listar Percuso \n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				objPercurso.cadastrarPercurso();
			break;
			
			case 2:
				objCusto.calcualarviagem(objPercurso);
			break;
			
			case 3:
				double resposta = objCusto.getTotalPercurso();
				objPercurso.listaPercurso(resposta);
			break;
			
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado....");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!!!!");
			break;
			}
			
		}while(opcao!=0);

	}

}