package tp2_viaje;

import java.util.Scanner;

public class Viaje {

    public Ciudad origen;
    public Ciudad destino;
    double distancia;
    Vehiculo vehiculo;
    int cant_peajes;
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Viaje() {
    }

    
    public Viaje(Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo, int cant_peajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cant_peajes = cant_peajes;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cant_peajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cant_peajes = cant_peajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCant_peajes() {
        return cant_peajes;
    }

    public void setCant_peajes(int cant_peajes) {
        this.cant_peajes = cant_peajes;

    }

    public double caldulardistancia(Ciudad origen, Ciudad destino) {
        if (origen.getRuta() == destino.getRuta()) {

            distancia = Math.abs(origen.getKm() - destino.getKm());
        } else {
            System.out.println("Ingrese la distancia");
            distancia = leer.nextDouble();
        }
        return distancia;

    }
    public double costoPeaje(){
        
        if (this.vehiculo instanceof Camion) {
            return cant_peajes*150;           
        }else {
        return cant_peajes*100;
        }
    }
     public double costoCombustible(){
         // si no funk hacer la variable 
         if (vehiculo instanceof Camion) {
             return vehiculo.CalcularCostoCombustib(distancia);
         }else if (vehiculo instanceof Camioneta ) {
             return vehiculo.CalcularCostoCombustib(distancia);
             
         }else         
             if ( vehiculo instanceof Auto) {
              return vehiculo.CalcularCostoCombustib(distancia);
             }
        return 0;
         }
        
     public double costoTotal(){
         
     return (costoPeaje()+costoCombustible());
     }
     
     
     public void crearViaje(){
         Ciudad origen = new Ciudad();
         Ciudad destino = new Ciudad();
         System.out.println("ingresar ciudad de Origen");
         origen.setNombre(leer.next());
         System.out.println("Ingrese km");
         origen.setKm(leer.nextDouble());
         System.out.println("Ingrese ruta");
         origen.setRuta(leer.nextInt());
         System.out.println("ingresar ciudad de destino");
         destino.setNombre(leer.next());
         System.out.println("Ingrese km");
         destino.setKm(leer.nextDouble());
         System.out.println("Ingrese ruta");
         destino.setRuta(leer.nextInt());
         distancia=caldulardistancia(origen,destino);
         System.out.println("que vehiculo tiene: 1-Auto 2-CAMIONETA 3- CAMION");
         int opc=leer.nextInt();
         switch (opc) {
             case 1:
                 Auto au = new Auto();
                 au.crearAuto(au);
                 vehiculo = au;
                 break;
             case 2:
                 Camioneta camioneta=new Camioneta();
                 camioneta.crearCamioneta(camioneta);
                 vehiculo=camioneta;
                 break;
                 case 3: Camion camion=new Camion();
                 camion.crearCamion(camion);
                 vehiculo=camion;
                 break;
         }
         
         System.out.println("Que cantidad de peajes hay en la ruta");
         cant_peajes=leer.nextInt();
         vehiculo.toString();
         System.out.println("costo de peaje = "+costoPeaje());
         System.out.println("costo de combustible = " +costoCombustible());
         System.out.println("costo total = " +costoTotal());
     
     
     }
     
     }
