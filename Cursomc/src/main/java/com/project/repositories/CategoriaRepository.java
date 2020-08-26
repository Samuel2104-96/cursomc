package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.domain.Categoria;

@Repository
public interface  CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	
	

}
