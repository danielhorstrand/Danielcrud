package com.DanielHcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DanielHcrud.entity.Estudiante;
  
public interface Estudiante_DAO extends JpaRepository<Estudiante, Long> {  
  
}  