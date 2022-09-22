package tp2_viaje;

public class Combustible {

    String tipoCombustible;
    double precioCombustible;

    public Combustible(String tipoCombustible, double precioCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.precioCombustible = precioCombustible;
    }
    

    public double getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    


}
