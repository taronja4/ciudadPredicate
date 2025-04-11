import java.util.ArrayList;

public class ciudad {
    String nombre;
    int numHabiitantes;
    ArrayList<ciudad> ciudads=new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabiitantes() {
        return numHabiitantes;
    }

    public void setNumHabiitantes(int numHabiitantes) {
        this.numHabiitantes = numHabiitantes;
    }

    public ciudad(String nombre, int numHabiitantes) {
        this.nombre = nombre;
        this.numHabiitantes = numHabiitantes;
    }

    @Override
    public String toString() {
        return "ciudad{" +
                "nombre='" + nombre + '\'' +
                ", numHabiitantes=" + numHabiitantes +
                '}';
    }
}
