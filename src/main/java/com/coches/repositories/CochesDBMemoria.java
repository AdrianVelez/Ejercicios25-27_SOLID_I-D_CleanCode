package com.coches.repositories;

import com.coches.entities.Coche;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CochesDBMemoria implements CochesDB, CochesPorClase{

    ArrayList<Coche> coches = new ArrayList<>();

    @Override
    public ArrayList<Coche> obtener() {
        return coches;
    }

    @Override
    public Coche buscar(Coche coche) {
        System.out.println("Resultado de busqueda:  ");
        for (Coche cocheActual : obtener()) {
            if (cocheActual.getModelo().equalsIgnoreCase(coche.getModelo())){
                return cocheActual;
            }
        }
        return null;
    }

    @Override
    public void insertar(Coche coche) {
        for (Coche cocheActual : coches) {
//            if (cocheActual.getClass().equals(coche.getClass())) {
//                    return;
//            }
        }
        coches.add(coche);
    }

    @Override
    public void borrar(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if(coches.get(i).getModelo().equalsIgnoreCase(coche.getModelo())){
                coches.remove(i);
            }
        }
    }

    @Override
    public ArrayList<Coche> ListarPorClase(){
        ArrayList<Coche> result = coches;

        System.out.println("Lista de coches: combustible ");
        coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheCombustible"))
                .forEach(System.out::println);
        System.out.println("Lista de coches: Electricos ");
        coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheElectrico"))
                .forEach(System.out::println);
        System.out.println("Lista de coches: Hibridos ");

        coches.stream().filter(x -> x.getClass().getName().equalsIgnoreCase("CocheHibrido"))
                .forEach(System.out::println);

        return (ArrayList<Coche>) coches.stream().collect(Collectors.toList());

    }

}

 