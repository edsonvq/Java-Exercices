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
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Entrada de dados \n2 - Calcular Comissão \n3 - Mostrar Informações \n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				objVendedor.entradaDados();
			break;
			
			case 2:
				passagemV = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido"));
				resposta = objVendedor.comissao(passagemV);
				JOptionPane.showMessageDialog(null, "Comissão: " + resposta);
			break;
			
			case 3:
					objVendedor.mostrarDados();		
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