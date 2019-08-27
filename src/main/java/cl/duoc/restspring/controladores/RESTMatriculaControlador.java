/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.controladores;

import cl.duoc.restspring.modelos.MatriculaEntidad;
import cl.duoc.restspring.modelos.MatriculaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTMatriculaControlador {

    @Autowired
    MatriculaRepositorio mr;
    
      
    @GetMapping("/matriculas")
    public List<MatriculaEntidad> listar(){
        return mr.findAll();
    }
    @GetMapping("/matriculas/{id}")
    public MatriculaEntidad listar(@PathVariable Integer id){
        return mr.findById(id).orElse(new MatriculaEntidad());
    }
}
