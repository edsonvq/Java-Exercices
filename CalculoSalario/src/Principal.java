import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		
		{
			Vendedor objV = new Vendedor();
			Gerente objG = new Gerente();
			Atendente objA = new Atendente();
			
			int opcao, opcao2;
			
			do
			{
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
						"\n1 - Gerente\n2 - Vendedor\n3 - Atendente\n0 - SAIR"));
			switch (opcao)
			{
			case 1:
				do{
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
							"\n1 - Cadastrar funcion�rio\n2 - Calcular sal�rio\n3 - Calcular bonifica��o\n4 - Apresentar sal�rio final\n0 - Voltar"));
				
						switch (opcao2)
						{
						case 1:
							objG.cadastrarFuncionario();
						break;
					
						case 2:
							objG.calcularSalarioFinal();
							objG.calcularBonificacao();
							objA.calculofeito();
						break;
						
						case 3:
							objA.calculofeito();
						break;
						
						case 4:
							objG.apresentarSalario();
						break;
					
						case 0:

						break;
						default:
							JOptionPane.showMessageDialog(null, "Op��o inv�lida!!!!");
						break;
				}
				}while(opcao2!=0);
				
				
			case 2:
				do{
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
							"\n1 - Cadastrar funcion�rio\n2 - Calcular sal�rio\n3 - Calcular bonifica��o\n4 - Apresentar sal�rio final\n0 - Voltar"));
				
						switch (opcao2)
						{
						case 1:
							objV.cadastrarFuncionario();
						break;
					
						case 2:
							objA.calculofeito();
							objV.calcularBonificacao();
							objV.calcularSalarioFinal();
						break;
					
						case 3:
							objV.apresentarSalario();
						break;

						case 0:

						break;

						default:
							JOptionPane.showMessageDialog(null, "Op��o inv�lida!!!!");
						break;
				}
				}while(opcao2!=0);
				
				
			break;
			case 3:
				do{
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
							"\n1 - Cadastrar funcion�rio\n2 - Calcular sal�rio\n3 - Calcular bonifica��o\n4 - Apresentar sal�rio final\n0 - Voltar"));
				
						switch (opcao2)
						{
						case 1:
							objA.cadastrarFuncionario();
						break;
					
						case 2:
							objA.calculofeito();
							objA.calcularBonificacao();
							objA.calcularSalarioFinal();
						break;
					
						case 3:
							objA.apresentarSalario();
						break;
						case 0:

						break;

						default:
							JOptionPane.showMessageDialog(null, "Op��o inv�lida!!!!");
						break;
				}
				}while(opcao2!=0);
				
			break;
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado!");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida...");
			break;
			}
		
		}while(opcao!=0);
		}
	}
}