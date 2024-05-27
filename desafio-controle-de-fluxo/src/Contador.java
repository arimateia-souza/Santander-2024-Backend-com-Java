public class Contador {

    public static void contar (int primeiro, int segundo) throws ParametrosInvalidosException{
        int diferenca = segundo - primeiro;
        if (primeiro > segundo){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            for (int i = 0; i < diferenca; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}

