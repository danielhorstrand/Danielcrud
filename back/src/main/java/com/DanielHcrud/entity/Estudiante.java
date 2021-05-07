package com.DanielHcrud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="estudiantes")
public class Estudiante implements Serializable {  
    

	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int estudiante_id;  
    
    @Column
    private String estudiante_name;  
    @Column
    private String estudiante_email;
    @Column
    private String estudiante_branch;  
    
    public int getEstudiante_id() {  
        return estudiante_id;  
    }  
    public void setEstudiante_id(int estudiante_id) {  
        this.estudiante_id = estudiante_id;  
    }  
    public String getEstudiante_name() {  
        return estudiante_name;  
    }  
    public void setEstudiante_name(String estudiante_name) {  
        this.estudiante_name = estudiante_name;  
    }  
    public String getEstudiante_email() {  
        return estudiante_email;  
    }  
    public void setEstudiante_email(String estudiante_email) {  
        this.estudiante_email = estudiante_email;  
    }  
    public String getEstudiante_branch() {  
        return estudiante_branch;  
    }  
    public void setEstudiante_branch(String estudiante_branch) {  
        this.estudiante_branch = estudiante_branch;  
    }  
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      
}  