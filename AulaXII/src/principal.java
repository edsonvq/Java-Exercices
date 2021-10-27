import javax.swing.JOptionPane;


public class principal
{
	public static void main(String[] args)
	{
		Alimentacao objA = new Alimentacao();
		Transporte objT = new Transporte();
		Diaria objD = new Diaria();
		
		int opcao, opcao2;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Alimentação\n2 - Transporte\n3 - Diaria\n0 - SAIR"));
			
		if (opcao==1)
		{
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Cadastrar despesa\n2 - Calcular despesa\n3 - Apresentar despesa\n0 - SAIR"));
		
				switch (opcao2)//Alimentação
				{
				case 1://Cadastrar
					objA.cadastrarDespesa();
				break;
			
				case 2://Calcular
					objA.calcularDespesa();
				break;
			
				case 3://Apresentar
					objA.listarDespesa();
				break;
			
				case 0:
					JOptionPane.showMessageDialog(null, "Voltar");
				break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!!!!");
				break;
		}	
				}
		else
		
		if (opcao==2)
		{
			opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Cadastrar despesa\n2 - Calcular despesa\n3 - Apresentar despesa\n0 - SAIR"));
		
				switch (opcao2)//Transporte
				{
				case 1://Cadastrar
					objT.cadastrarDespesa();
				break;
			
				case 2://Calcular
					objT.calcularDespesa();
				break;
			
				case 3://Apresentar
					objT.listarDespesa();
				break;

				case 0:
					JOptionPane.showMessageDialog(null, "Voltar");
				break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!!!!");
				break;
				}
		}
			else
			
			if (opcao==3)
			{
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
						"\n1 - Cadastrar despesa\n2 - Calcular despesa\n3 - Apresentar despesa\n0 - SAIR"));
			
					switch (opcao2)//Diaria
					{
					case 1://Cadastrar
						objD.cadastrarDespesa();
					break;
				
					case 2://Calcular
						objD.calcularDespesa();
					break;
				
					case 3://Apresentar
						objD.listarDespesa();
					break;
					case 0:
						JOptionPane.showMessageDialog(null, "Voltar");
					break;

					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!!!!");
					break;
					}
			}
		
		if (opcao==0) JOptionPane.showMessageDialog(null, "Programa Terminado!");
		
		}while(opcao!=0);
	}
}
