package com.inezpre5.controlador;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.inezpre5.modelo.Marcas;
import com.inezpre5.repositorio.MarcasJPA;
 
@RestController
@RequestMapping("/anidados")
public class ControladorAnidados {
    @Autowired
    MarcasJPA marJpa;
 
    @RequestMapping("/lista")
    public List Modelos List lista(){
        List lista = marJpa.findAll();
        return lista;
    }
}