package br.com.alura.screenmatch.atividades.heranca.atividade04;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int ultimoPrimo) {

        int proximoNumero = ultimoPrimo + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}

