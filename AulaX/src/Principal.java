import javax.swing.JOptionPane;


public class Principal
{
	public static void main(String[] args)
	{
		Autenticacao HUE = new Autenticacao();
		
		int opcao;

		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Visitante\n2 - Usuário temporário\n3 - Usuário\n4 - Administrador\n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
					String str = HUE.validar();
					JOptionPane.showMessageDialog(null, str);
			break;
			
			case 2:
					Integer passagemA = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
					str = HUE.validar(passagemA);
					JOptionPane.showMessageDialog(null, str);
			break;
			
			case 3:
					String passagemB = JOptionPane.showInputDialog("Digite a senha");
					str = HUE.validar(passagemB);
					JOptionPane.showMessageDialog(null, str);
			break;
			
			case 4:
					passagemB = JOptionPane.showInputDialog("Digite o login");
					String passagemC = JOptionPane.showInputDialog("Digite a senha");
					str = HUE.validar(passagemB, passagemC);
					JOptionPane.showMessageDialog(null, str);
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
