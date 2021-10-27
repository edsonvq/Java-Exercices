import javax.swing.JOptionPane;
public class Principal
{
	public static void main(String[] args)
	{
		Comanda Obj1 = new Comanda();	
		Caixa Obj2 = new Caixa();
		int opcao;
		double resposta = 0;
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Lançar gastos " +
					"\n2 - Verificar promoção " +
					"\n3 - Fechar mesa " +
					"\n4 - Listar comanda " +
					"\n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				Obj1.lancarGastos();
			break;
			
			case 2:
				Obj1.verificarPromocao();
			break;
			
			case 3:
				resposta = Obj2.totalizarComanda(Obj1);
			break;

			case 4:
				Obj1.listarComanda(resposta);
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