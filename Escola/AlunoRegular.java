package escola;

    public class AlunoRegular extends Aluno {

        private String ra;
        private double nota_1;
        private double nota_2;
        private int faltas_b;
        
        public AlunoRegular(String _nome, int _faltas, String _ra, double _nota_1, double _nota_2) {
            super(_nome, _faltas);
            this.ra = _ra;
            this.nota_1 = _nota_1;
            this.nota_2 = _nota_2;
        }
        
        public void registrarNotas(double n1, double n2){
            this.nota_1 = n1;
            this.nota_2 = n2;
        }
        public double media(){
            double n = this.nota_1+this.nota_2/2;
            return n;
        }
        public void abonarFaltas(int n){
            if(this.faltas_b < 5){
                super.faltas -=  n;
            }
        }

        public boolean aprovado() {
            if(media() >= 6.0 && super.frequencia() >= 75.0){
                return true;
            }
            return false;
        }

        public void verHistorico() {
            System.out.println("Nota_1: " + this.nota_1);
            System.out.println("Nota_2: " + this.nota_2);
            System.out.println("Média: " + media());
            System.out.println("Resultado Final: " + (aprovado() ? "APROVADO" : "REPROVADO") );
        }
        
        
    }