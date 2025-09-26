package aula007;

public class Ex2 {
    public static void main(String[] args) {
        float i = 1;
        float s = 0;
        float resultadoPares = 0;
        float resultadoImpares = 0;

        while (i <= 10){
            if(i%2==0){
                s = i / (i * i);
                resultadoPares = resultadoPares + s;

            }
            else {
                s = i / (i * i);
                resultadoImpares = resultadoImpares + s;
            }
            i++;
        }
            float resultadoFinal = resultadoImpares - resultadoPares;
            System.out.println(resultadoFinal);
    }
}
