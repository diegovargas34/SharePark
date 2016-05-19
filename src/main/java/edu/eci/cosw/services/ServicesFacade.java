/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

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
        dummyBluePrints.put(123, new Parqueadero(123,321,30,"Bogota","Cubierto","Teusaquillo"));
        dummyBluePrints.put(124, new Parqueadero(124,322,40,"Bogota","Abierto","Teusaquillo"));
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
    
    public ArrayList <Integer> getBlueprintsByNeighborhood(String neighborhood){
        
        ArrayList <Integer> validos = new ArrayList<Integer>();
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
