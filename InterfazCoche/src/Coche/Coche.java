package Coche;

public class Coche {

    protected String fabricante;
    protected String modelo;
    protected Double cc;
    protected int fechaFabricacion;
    protected boolean deportivo;
    protected int velocidad;


    //2.comnstructores

    public Coche(){

    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", fechaFabricacion=" + fechaFabricacion +
                ", deportivo=" + deportivo +
                ", velocidad=" + velocidad +
                '}';
    }

    public Coche(String fabricante, String modelo, Double cc, int fechaFabricacion, boolean deportivo, int velocidad) {
        this.modelo = modelo;
        this.cc = cc;
        this.fechaFabricacion = fechaFabricacion;
        this.deportivo = deportivo;
        this.velocidad = velocidad;
    }

//3.metodos

    public  void acelerar(int velocidad){
        this.velocidad += velocidad;
    }

}

