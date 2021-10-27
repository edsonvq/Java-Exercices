
public class Aluno {
    public String nome;
    public int faltas;

    public Aluno(String _nome, int _faltas) {
        this.nome = _nome;
        this.faltas = _faltas;
    }

    public void registrarFaltas(int i) {
        this.faltas += i;
    }

    public double frequencia(){
        double resultado = 100-((faltas*100)/60);
        return resultado;
    }
    
    public boolean aprovado() {
        if(this.frequencia() >= 75.0){
                return true;
            }
        return false;
    }

    public void verHistorico() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Faltas: " + this.faltas);
        System.out.println("Frequência: " + frequencia()+"%");
        
    }
}
