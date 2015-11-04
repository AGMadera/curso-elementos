/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author alfonsogalvanmadera
 */

@Controller 
@RequestMapping("/")
public class ControladorInicial {
    
    @RequestMapping("/")
    @ResponseBody String hola(){
        return "Mi primer servicio de Spring es un simple string";
    }
    
}
