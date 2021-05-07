package com.DanielHcrud.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.DanielHcrud.entity.Estudiante;
import com.DanielHcrud.service.Estudiante_Service;  
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class Controller {  
      
    @Autowired  
    private Estudiante_Service estudianteservice;  
      
    @PostMapping("save-estudiante")  
    public Estudiante saveEstudiante(@RequestBody Estudiante estudiante) {  
         return estudianteservice.saveEstudiante(estudiante); 
          
    }  
      
    @GetMapping("estudiante-list")  
    public List<Estudiante> allestudiantes() {  
         return estudianteservice.getEstudiante();  
          
    }  
      
    @DeleteMapping("delete-estudiante/{estudiante_id}")  
    public boolean deleteStudent(@PathVariable("student_id") int estudiante_id,Estudiante estudiante) {  
    	estudiante.setEstudiante_id(estudiante_id);  
        return estudianteservice.deleteEstudiante(estudiante);  
    }  
  
    @GetMapping("estudiante/{estudiante_id}")  
    public List<Estudiante> allEstudianteByID(@PathVariable("estudiante_id") int estudiante_id,Estudiante estudiante) {  
    	estudiante.setEstudiante_id(estudiante_id);  
         return estudianteservice.getEstudianteByID(estudiante);  
          
    }  
      
    @PostMapping("update-estudiante/{estudiante_id}")  
    public boolean updateStudent(@RequestBody Estudiante estudiante,@PathVariable("estudiante_id") int estudiante_id) {  
    	estudiante.setEstudiante_id(estudiante_id);  
        return estudianteservice.updateEstudiante(estudiante);  
    }  
}  