package com.inezpre5.repositorio;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.inezpre5.modelo.Modelos;
 
public interface ModelosJPA extends JpaRepository  Modelos, Integer{
 
}