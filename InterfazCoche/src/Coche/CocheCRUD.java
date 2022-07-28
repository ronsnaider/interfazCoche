package Coche;

import java.util.List;

public interface CocheCRUD {

    void guardar(Coche coche);

    List<Coche> vertodo();

    void borrar(Coche coche);
}

