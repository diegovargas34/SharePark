/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

import edu.eci.cosw.samples.model.Blueprint;
import edu.eci.cosw.samples.model.Parqueadero;
import edu.eci.cosw.samples.model.Point;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public class ServicesFacade {
   
    private static final Map<Integer,Parqueadero> dummyBluePrints=new LinkedHashMap<>();
    
    static{
        dummyBluePrints.put(123, new Parqueadero(123,321,30,"Bogota","Cubierto"));
        dummyBluePrints.put(124, new Parqueadero(124,322,40,"Bogota","ABierto"));
    }
    
    public void addNewBlueprint(int codigo,Parqueadero p){
        dummyBluePrints.put(codigo,p);
    }
    //Prueba
    
    public Set<Integer> getBlueprintCodes(){
        return dummyBluePrints.keySet();
    }
    
    public Parqueadero getBlueprintByName(int code){
        return dummyBluePrints.get(code);
    }
    public Map<Integer,Parqueadero> getBlueprints(){
        return dummyBluePrints;
    }
    
}
