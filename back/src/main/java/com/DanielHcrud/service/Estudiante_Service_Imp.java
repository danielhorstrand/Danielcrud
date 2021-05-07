package com.DanielHcrud.service;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.DanielHcrud.dao.Estudiante_DAO;
import com.DanielHcrud.entity.Estudiante;  
  
@Service  
@Transactional  
public class Estudiante_Service_Imp implements Estudiante_Service {  
   
    @Autowired  
    private Estudiante_DAO estudiantedao;  
      
    @Override  
    public List<Estudiante> getEstudiante() {  
        return estudiantedao.findAll();  
    }

	@Override
	public Estudiante saveEstudiante(Estudiante estudiante) {
		
		return estudiantedao.save(estudiante);
	}

	@Override
	public boolean deleteEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Estudiante> getEstudianteByID(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return false;
	}  
  
  
}  