package com.DanielHcrud.service;

import java.util.List;

import com.DanielHcrud.entity.Estudiante;  
  
public interface Estudiante_Service {  
  
      
    public Estudiante saveEstudiante(Estudiante estudiante);  
    
    public List<Estudiante> getEstudiante();  
    
    public boolean deleteEstudiante(Estudiante estudiante);  
    
    public List<Estudiante> getEstudianteByID(Estudiante estudiante);  
    
    public boolean updateEstudiante(Estudiante estudiante);  
}  