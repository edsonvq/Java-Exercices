import javax.swing.JOptionPane;


public class Principal
{
	public static void main(String[] args)
	{
		Calculadora objCalculadora = new Calculadora();
		
		int opcao;
		double passagemA, passagemB;
		double resposta;
		
		do
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Op��o" +
					"\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - SAIR"));
			
			switch (opcao)
			{
			case 1:
					objCalculadora.somar();
			break;
			
			case 2:
					passagemA = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A"));
					passagemB = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B"));
					objCalculadora.subtrair(passagemA, passagemB);
			break;
			
			case 3:
					resposta = objCalculadora.multiplicar();
					JOptionPane.showMessageDialog(null, "Resultado da Multiplica��o: " + resposta);
			break;
			
			case 4:
				passagemA = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A"));
				passagemB = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B"));
				resposta = objCalculadora.dividir(passagemA, passagemB);
				JOptionPane.showMessageDialog(null, "Resultado da Divis�o: " + resposta);
			break;
			
			case 0:
				JOptionPane.showMessageDialog(null, "Programa Terminado....");
			break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!!!!");
			break;
			}
			
		}while(opcao!=0);

	}

}
