package crudPersonas.demo.service;

import crudPersonas.demo.interfaceService.IPersonaService;
import crudPersonas.demo.model.Personas;
import crudPersonas.demo.repository.RepostiryPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServicePersona implements IPersonaService {

    @Autowired
    private RepostiryPersonas repostiryPersonas;

    @Override
    public List<Personas> listar(){
        return (List<Personas>) repostiryPersonas.findAll();
    }

    @Override
    public Optional<Personas> listId(int id){
        return repostiryPersonas.findById(id);
    }

    @Override
    public int save(Personas p){
        int res =0;
        Personas persona = repostiryPersonas.save(p);
        if(!persona.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id){
        repostiryPersonas.deleteById(id);
    }

}
