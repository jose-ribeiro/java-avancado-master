package br.com.digital.innovation.one.aula4Operacao;

public interface Operacao {
    default int execute(int a, int b){

        return a;
    }
}
