package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // selecaoCandidatos();
        // imprimirSelecionados();

        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
            
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atenderCandidato();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativas++;
                System.out.println("Tentativa " + tentativas + " de contato com " + candidato);
            } else {
                System.out.println("Contato Realizado");

            }

        } while (continuarTentando && tentativas < 3);

        if (atendeu) {
            System.out.println("Candidato " + candidato + " atendeu a ligação");
        } else {
            System.out.println("Candidato " + candidato + " não atendeu a ligação");
        }

    }

    static void imprimirSelecionados () {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + candidatos[i]);
        }

        for (String candidato : candidatos) {
            System.out.println("Candidato: " + candidato);
            
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "Candidato " + (candidatoAtual +1) + ": " + candidato + " - Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println((candidatosSelecionados +1) +" Candidato selecionado: " + candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }

    static boolean atenderCandidato() {
        return new Random().nextInt(3) == 1;
    }
}
