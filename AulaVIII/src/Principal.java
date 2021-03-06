import javax.swing.JOptionPane;
public class Principal
{
	public static void main(String[] args)
	{
		Produto objPruduto = new Produto();	
		Cliente objCliente = new Cliente();
		int opcao;
		boolean resposta1 = false;
		boolean resposta2 = false;
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op??o" +
					"\n1 - Cadastrar Cliente " +
					"\n2 - Listar Cliente " +
					"\n3 - Cadastrar Produto " +
					"\n4 - Listar Produto " +
					"\n5 - Calcular limite de cr?dito " +
					"\n6 - Vender " +
					"\n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
				objCliente.cadastrarCliente();
			break;
			
			case 2:
				objCliente.listaCliente();
			break;
			
			case 3:
				objPruduto.cadastrarProduto();
			break;
			case 4:
				objPruduto.listaProduto();
			break;
			case 5:
				objCliente.calcularLimiteCredito();
			break;
			case 6:
				int passagemQtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produto que deseja comprar ?"));
				
				resposta1 = objPruduto.ComfirmarPedido(passagemQtd);
				
				if (resposta1 == true)
				{
					objPruduto.pedido(passagemQtd);
				}
				
				double valorcompra = objPruduto.pedido(passagemQtd);
				
				if (resposta1 == true)
				{
				resposta2 = objCliente.ComfirmarCompra(valorcompra);
				}
				
				if (resposta2 == true)
				{
					objPruduto.vender(passagemQtd);
				}
			break;
			
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado....");
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Op??o inv?lida!!!!");
			break;
			}
			
		}while(opcao!=0);

	}

}