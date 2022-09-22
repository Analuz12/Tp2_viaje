package tp2_viaje;

public class Ciudad {
String nombre;
int ruta;
double km;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", ruta=" + ruta + ", km=" + km + '}';
    }


}
