/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.controladores;

import cl.duoc.restspring.modelos.TallerEntidad;
import cl.duoc.restspring.modelos.TallerRepositorio;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/talleres")
    public TallerEntidad nuevo(@RequestBody Map<String, String> dato){
        TallerEntidad t = new TallerEntidad();
        t.setNombre(dato.get("nombre"));
        t.setDetalle(dato.get("detalle"));
        t.setNumhoras(Integer.parseInt(dato.get("numhoras")));
        t.setCupos(Integer.parseInt(dato.get("cupos")));
        return tr.save(t);
    }
    @PutMapping("/talleres/{id}")
    public TallerEntidad modificar(@RequestBody Map<String, String> dato, @PathVariable Integer id){
        TallerEntidad t = new TallerEntidad();
        t.setNumtaller(id);
        t.setNombre(dato.get("nombre"));
        t.setDetalle(dato.get("detalle"));
        t.setNumhoras(Integer.parseInt(dato.get("numhoras")));
        t.setCupos(Integer.parseInt(dato.get("cupos")));
        return tr.save(t);
    }
            
    @DeleteMapping("/talleres/{id}")
    public boolean borrar(@PathVariable Integer id){
        tr.deleteById(id);
        return !tr.existsById(id);
    }
}
