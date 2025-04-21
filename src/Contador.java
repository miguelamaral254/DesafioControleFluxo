public class Contador {
    private int parametroUm;
    private int parametroDois;

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public int getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(int parametroUm) {
        this.parametroUm = parametroUm;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(int parametroDois) {
        this.parametroDois = parametroDois;
    }
}