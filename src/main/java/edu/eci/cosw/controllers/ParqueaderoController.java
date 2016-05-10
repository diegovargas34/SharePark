/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.controllers;

import edu.eci.cosw.samples.model.Blueprint;
import edu.eci.cosw.samples.model.Parqueadero;
import edu.eci.cosw.services.ServicesFacade;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/parqueaderos")
public class ParqueaderoController {
    
    @Autowired
    ServicesFacade services;
    
    
    @RequestMapping(value="/check",method = RequestMethod.GET)        
    public String check() {
        return "REST API OK";        
    }
    
    @RequestMapping(method = RequestMethod.POST)        
    public ResponseEntity<?> addBlueprint(@RequestBody Parqueadero p) {       
        services.addNewBlueprint(p.getCodigo(),p);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    
    /*@RequestMapping(method = RequestMethod.GET)
    public Set<String> allBlueprintNames() {       
        return services.getBlueprintNames();
        
    }*/
    
    @RequestMapping(method = RequestMethod.GET)
    public Map<Integer,Parqueadero> allBlueprints() {       
        return services.getBlueprints();
        
    }
    
    //hello
    
    @RequestMapping(value = "/{blueprintcode}",method = RequestMethod.GET)        
    @ResponseBody
    public Parqueadero getABlueprint(@PathVariable("blueprintcode") int blueprintcode) {       
        return services.getBlueprintByName(blueprintcode);
    }

        
}

