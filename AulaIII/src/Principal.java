import javax.swing.JOptionPane;

public class Principal
{
	public static void main(String[] args)
	{
		Funcionario objFunc = new Funcionario();
		
		int opcao;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
											"\n1 - Cadastrar Funcionario" +
											"\n2 - Listar Funcionario" + 
											"\n3 - Calcular Valores e Sal�rio" +
											"\n0 - Sair"));
			switch (opcao)
			{
			case 1:
				objFunc.entradaDados();
				break;
			case 2:
				objFunc.mostrarDados();
				break;
			case 3:
				objFunc.calcularValores();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida!!!");
				break;
			}
		}while(opcao!=0);
	}
}
