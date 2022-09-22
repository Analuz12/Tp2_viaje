
package tp2_viaje;

public abstract class Vehiculo {
    String marca;
    String patente;
    Combustible comb;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getComb() {
        return comb;
    }

    public void setComb(Combustible comb) {
        this.comb = comb;
    }
    
    
public double CalcularCostoCombustib(double dist){
        return 0;

}

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", patente=" + patente + ", comb=" + comb + '}';
    }


}