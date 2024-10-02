package com.crudclientes.proyecto1Clientes.repository;


import com.crudclientes.proyecto1Clientes.entity.Persona;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Long> {

}
