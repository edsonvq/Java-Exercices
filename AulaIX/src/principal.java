import javax.swing.JOptionPane;


public class principal
{
	public static void main(String[] args)
	{
		livro objLivro = new livro();
		cd objCD = new cd();
		dvd objDVD = new dvd();
		
		int opcao, quantidade, opcao2;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Livro\n2 - CD\n3 - DVD\n0 - SAIR"));
			
		if (opcao==1)
		{
		
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção" +
					"\n1 - Comprar\n2 - Vender\n3 - Listar Produtos\n0 - Voltar Menu"));
		
				switch (opcao2)//Livro
				{
				case 1://Comprar
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Compra"));
					objLivro.comprar(quantidade);
				break;
			
				case 2://Vender
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Venda"));
					objLivro.vender(quantidade);
				break;
			
				case 3://Listar
					objLivro.listarProduto();
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
					"\n1 - Comprar\n2 - Vender\n3 - Listar Produtos\n0 - Voltar Menu"));
		
				switch (opcao2)//CD
				{
				case 1://Comprar
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Compra"));
					objCD.comprar(quantidade);
				break;
			
				case 2://Vender
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Venda"));
					objCD.vender(quantidade);
				break;
			
				case 3://Listar
					objCD.listarProduto();
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
						"\n1 - Comprar\n2 - Vender\n3 - Listar Produtos\n0 - Voltar Menu"));
			
					switch (opcao2)//DVD
					{
					case 1://Comprar
						quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Compra"));
						objDVD.comprar(quantidade);
					break;
				
					case 2://Vender
						quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade para Venda"));
						objDVD.vender(quantidade);
					break;
				
					case 3://Listar
						objDVD.listarProduto();
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
