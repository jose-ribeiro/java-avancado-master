package br.com.digital.innovation.one.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
      Calculo soma =  ( a, b) -> a+b;
      Calculo sub =  ( a, b) -> a-b;
      Calculo div =  ( a, b) -> a/b;
      Calculo milt =  ( a, b) -> a*b;
        System.out.println(executarOperacao(soma,1,3));//4
        System.out.println(executarOperacao(sub,4,3));//1
        System.out.println(executarOperacao(div,6,2));//3
        System.out.println(executarOperacao(milt,2,2));//4
    }



    public static int executarOperacao(Calculo calculo,int a, int b){
        return calculo.calcular(a,b);
    }
}


@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}