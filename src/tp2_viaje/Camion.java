package tp2_viaje;

import java.util.Scanner;
import static tp2_viaje.Auto.leer;

public class Camion extends Vehiculo {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getPatente() {
        return patente;
    }

    @Override
    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public Combustible getComb() {
        return comb;
    }

    @Override
    public void setComb(Combustible comb) {
        this.comb = comb;
    }

    @Override
    public double CalcularCostoCombustib(double dist) {
        return ((dist*12)/100)*comb.precioCombustible;
    }

   
    public Vehiculo crearCamion(Vehiculo camion) {
        System.out.println("ingresar marca");
        marca = leer.next();
        System.out.println("ingresar patente");
        patente = leer.next();
        System.out.println("ingresar tipo combustible y precio");
        Combustible c1 = new Combustible(leer.next(), leer.nextDouble());
        camion.setMarca(marca);
        camion.setPatente(patente);
        camion.setComb(c1);
        return camion;
    }

}
