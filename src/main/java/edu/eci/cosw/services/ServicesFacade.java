/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

import edu.eci.cosw.samples.model.Bloque;
import edu.eci.cosw.samples.model.Blueprint;
import edu.eci.cosw.samples.model.Parqueadero;
import edu.eci.cosw.samples.model.Point;
import java.util.ArrayList;
import java.util.Iterator;
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
        dummyBluePrints.put(123, new Parqueadero(123,321,30,"Bogota","Cubierto","Teusaquillo",new Bloque("10am","5pm","10/06/2016","10/06/2016")));
        dummyBluePrints.put(124, new Parqueadero(124,322,40,"Bogota","Abierto","Teusaquillo",new Bloque("7am","6pm","20/06/2016","20/06/2016")));
        dummyBluePrints.put(125, new Parqueadero(125,323,50,"Bogota","Cubierto","Candelaria",new Bloque("8am","4pm","30/06/2016","30/06/2016")));
    }
    
    public void addNewBlueprint(int codigo,Parqueadero p){
        dummyBluePrints.put(codigo,p);
    }
    //Prueba
    
    public Set<Integer> getBlueprintCodes(){
        return dummyBluePrints.keySet();
    }
    
    public Parqueadero getBlueprintByCode(int code){
        return dummyBluePrints.get(code);
    }
    
    
    public Map<Integer,Parqueadero> getBlueprints(){
        return dummyBluePrints;
    }
    
    public Bloque getBlueprintsBlock(int code){
        return dummyBluePrints.get(code).getBloque();
    }
    
    public ArrayList <Integer> getBlueprintsByNeighborhood(String neighborhood){
        
        ArrayList <Integer> validos = new ArrayList<>();
        int code=123;
        Iterator iterator = dummyBluePrints.keySet().iterator();
        while(iterator.hasNext()){
            int key   = (int) iterator.next();
            if(dummyBluePrints.get(code).getBarrio().equals(neighborhood)){
                validos.add(code);
                code++;
            }
            }    
        return validos;
    }
    
    
    
}
