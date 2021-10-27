import javax.swing.JOptionPane;


public class usuario {
	private String nome;
	private String email;
	private String login;
	private String senha;
	
	public usuario(String nome, String email, String login, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	public usuario ()
	{
		this ("","","","");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void provarexistencia()
	{
		setNome(JOptionPane.showInputDialog("Digite o nome"));
		setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
		setLogin(JOptionPane.showInputDialog("Digite o login"));
		setSenha(JOptionPane.showInputDialog("Digite a senha"));
	}
	public void mostrarexistenciaI()
	{
		JOptionPane.showConfirmDialog (null, "nome: " + getNome());
		JOptionPane.showConfirmDialog (null, "E-mail " + getEmail());
		JOptionPane.showConfirmDialog (null, "Login " + getLogin());
		JOptionPane.showConfirmDialog (null, "Senha"  + getSenha());
	}
	public void mostrarexistenciaII()
	{
		JOptionPane.showConfirmDialog (null, " \n nome: " + getNome()+
		 									 "\n E-mail: " + getEmail()+
		 									 "\n Login " + getLogin()+
		 									 "\n Senha"  + getSenha()
		
		);
	
	
	
}
}
