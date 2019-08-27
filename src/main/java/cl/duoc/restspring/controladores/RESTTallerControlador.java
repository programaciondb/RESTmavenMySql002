/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.controladores;

import cl.duoc.restspring.modelos.TallerEntidad;
import cl.duoc.restspring.modelos.TallerRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTTallerControlador {
    
    @Autowired
    TallerRepositorio tr;
    
    @GetMapping("/")
    public String main(){
        return "Talleres";
    }
    
    @GetMapping("/talleres")
    public List<TallerEntidad> listar(){
        return tr.findAll();
    }
    @GetMapping("/talleres/{id}")
    public TallerEntidad listar(@PathVariable Integer id){
        return tr.findById(id).orElse(new TallerEntidad());
    }
}
