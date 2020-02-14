
public class Inversion {
    private static int cantidadDecimales = 4;
    private double montoInversion;
    private double interesAnual;

    public Inversion(double montoInversion, double interesAnual) {
        this.montoInversion = montoInversion;
        this.interesAnual = interesAnual;
    }

    public double calcularInversionMostrarPor(Integer cantidadAños) {
        double resultado = this.montoInversion * Math.pow(calculoInteresMes(), cantidadAños * 12);
        //for solo para ver
        for (int i = 1; i < cantidadAños + 1; i++) {
            System.out.println(formatearDecimales(this.montoInversion * Math.pow(calculoInteresMes(), i * 12)));
        }
        return formatearDecimales(resultado);
    }

    public int calcularCuantoTiempoEnMesesCon(double saldoFinalDeseado) {
        double resultado = Math.log(saldoFinalDeseado / montoInversion) / Math.log(calculoInteresMes());
        System.out.println((int) Math.ceil(resultado));
        return (int) Math.ceil(resultado);
    }

    private static double formatearDecimales(Double numero) {
        return Math.round(numero * Math.pow(10, cantidadDecimales)) / Math.pow(10, cantidadDecimales);
    }

    private double calculoInteresMes() {
        return 1.0 + (this.interesAnual / 12);
    }
}

