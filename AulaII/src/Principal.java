import javax.swing.JOptionPane;

public class Principal
{
	public static void main(String[] args)
	{
		Automovel objAutomovel = new Automovel();
		
		int opcao;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
											"\n1 - Cadastrar Automóvel" +
											"\n2 - Listar Informações" + 
											"\n3 - Calcular Preço Final" +
											"\n0 - Sair"));
			switch (opcao)
			{
			case 1:
				objAutomovel.entradaDados();
				break;
			case 2:
				objAutomovel.mostrarDados();
				break;
			case 3:
				objAutomovel.calcularValores();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");
				break;
			}
		}while(opcao!=0);
	}
}
