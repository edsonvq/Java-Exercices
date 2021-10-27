import javax.swing.JOptionPane;

public class Principal
{
	public static void main(String[] args)
	{
		Cliente objCliente = new Cliente();
		
		int opcao;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
											"\n1 - Cadastrar Cliente" +
											"\n2 - Listar Cliente" + 
											"\n3 - Calcular Limite de Credito" +
											"\n0 - Sair"));
			switch (opcao)
			{
			case 1:
				objCliente.entradaDados();
				break;
			case 2:
				objCliente.mostrarDados();
				break;
			case 3:
				objCliente.calcularValores();
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
