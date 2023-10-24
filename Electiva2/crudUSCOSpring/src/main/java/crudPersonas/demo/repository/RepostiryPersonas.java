package crudPersonas.demo.repository;

import crudPersonas.demo.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepostiryPersonas  extends JpaRepository<Personas, Integer> {


}
