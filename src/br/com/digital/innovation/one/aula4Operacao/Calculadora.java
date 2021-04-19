package br.com.digital.innovation.one.aula4Operacao;

public class Calculadora {
    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
        multiHelper = new MultiHelper();

    }
    public int sun(int a, int b){
        return  sumHelper.execute(a,b);
    }
    public int div(int a, int b){
        return  divHelper.execute(a,b);
    }
    public int multi(int a, int b){
        return  multiHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return  subHelper.execute(a,b);
    }

}
