package escola;


    public class AlunoAssistente extends Aluno {

        private String rg;
        private boolean entregou_resumo;

        public AlunoAssistente(String _nome, int _faltas, String _rg, boolean _entregou_resumo) {
            super(_nome, _faltas);
            this.rg = _rg;
            this.entregou_resumo = _entregou_resumo;
        }

        public void receberResumo(){
            entregou_resumo = true;
        }
        
        public boolean aprovado() {
            if(entregou_resumo && frequencia() >= 75.0){
                return true;
            }
            return false;
        }
        
        public void verHistorico() {
            super.verHistorico();
            System.out.println("Resumo: " + (aprovado() ? "ENTREGUE" : "NAO ENTREGUE") );
            System.out.println("Resultado Final: " + (aprovado() ? "APROVADO" : "REPROVADO") );
        }
        
    }