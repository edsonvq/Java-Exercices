public class Autenticacao
{
	private String login, senha, r;

	public Autenticacao(String r, String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
		this.r = r;
	}
	
	public Autenticacao()
	{
		this("","","");
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

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String validar()
	{
		setR("Bem vindo visitante!");
		return getR();
	}
	
	public String validar(Integer a)
	{
		if (a == 123)
		{
		setR("Bem vindo usuário teste!"); 	
		}
		else
		{
		setR("Usuário temporário inválido!"); 	
		}
		return getR();
	}
	public String validar (String b)
	{
		if (b.equals ("abc"))
		{
		setR("Bem vindo usuário!"); 	
		}
		else
		{
		setR("Usuário inválido!"); 	
		}
		return getR();
	}
	public String validar (String c, String d)
	{
		if (c.equals ("adm") && d.equals ("master"))
		{
		setR("Bem vindo administrador!"); 	
		}else
		{
		setR("Administrador inválido!"); 	
		}
		return getR();
	}	
}