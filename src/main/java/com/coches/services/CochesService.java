package com.coches.services;

import com.coches.entities.Coche;
import com.coches.repositories.CochesDB;
import com.coches.repositories.CochesPorClase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CochesService {

    CochesDB cochesDB;
    CochesPorClase cochesPorClase;

    public CochesService(CochesDB cochesDB, CochesPorClase cochesPorClase ){
        this.cochesDB=cochesDB;
        this.cochesPorClase=cochesPorClase;
    }
    public ArrayList<Coche> listarCoches() {
        return cochesDB.obtener();
    }

    public Coche obtenerCoche(String modelo) {
       Coche coche = new Coche();
       coche.setModelo(modelo);
        return cochesDB.buscar(coche);
    }

    public void crearCoche(Coche coche){
//        if(cochesDB.buscar(coche) != null){
//            return;
//        }
        cochesDB.insertar(coche);

    }
    public void borrarCoche(String modelo){
        Coche coche = new Coche();
        coche.setModelo(modelo);
        cochesDB.borrar(coche);
    }

    public ArrayList<Coche> ListarPorClase(){

        return cochesPorClase.ListarPorClase();
    }

}
