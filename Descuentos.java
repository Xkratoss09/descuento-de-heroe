    public class Descuentos {

    public static void main(String[] args) {
      
        double salarioBase = 2000000.0;

        
        double descuentoSaludMagica = salarioBase * 0.04;
        double descuentoProteccionPension = salarioBase * 0.05;

       
        double salarioNeto = salarioBase - descuentoSaludMagica - descuentoProteccionPension;

        
        System.out.println("Salario base: " + salarioBase + " monedas de oro");
        System.out.println("Descuento por salud magica (4%): " + descuentoSaludMagica + " monedas de oro");
        System.out.println("Descuento por proteccion de pension (5%): " + descuentoProteccionPension + " monedas de oro");
        System.out.println("Salario neto: " + salarioNeto + " monedas de oro");

        
        System.out.println("Tu salario final es de " + salarioNeto + " monedas de oro. ¡Preparate para tu proxima aventura!");
    }
}

