import javax.swing.JOptionPane;
public class Principal
{
	public static void main(String[] args)
	{
		Vendedor objVendedor = new Vendedor();
		
		int opcao;
		double passagemV;
		double resposta;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
					"\n1 - Entrada de dados \n2 - Calcular Comiss�o \n3 - Mostrar Informa��es \n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				objVendedor.entradaDados();
			break;
			
			case 2:
				passagemV = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido"));
				resposta = objVendedor.comissao(passagemV);
				JOptionPane.showMessageDialog(null, "Comiss�o: " + resposta);
			break;
			
			case 3:
					objVendedor.mostrarDados();		
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