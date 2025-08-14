public class EstruturaIf {
    public static void main(String[] args) {
        Boolean movimentaPeloMenosMetadeDoValor = true;
        Boolean temTempoSuficienteDeAbertura = true;
        Boolean temNomeLimpo = true;
        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
                && temTempoSuficienteDeAbertura
                && temNomeLimpo;

        if (liberarEmprestimo) {
            System.out.println("Sim ! Pode liberar empréstimo.!");
        }
        
    }
}