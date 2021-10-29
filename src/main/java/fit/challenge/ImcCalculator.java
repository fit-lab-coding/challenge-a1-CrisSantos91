package fit.challenge;

public class ImcCalculator {
    public static String calculate(double peso, double altura) {

        return imc(peso, altura);
    }

    public static String imc(double peso, double altura) {
        double imc = peso/Math.pow(altura, 2);

        if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30) {
            return "Obesidade";
        } else if (imc < 18.5) {
            return "Magreza";
        } else {
            return "Normal";
        }
    }
}
