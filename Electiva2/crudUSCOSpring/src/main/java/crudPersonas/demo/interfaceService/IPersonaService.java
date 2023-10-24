package crudPersonas.demo.interfaceService;

import crudPersonas.demo.model.Personas;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Personas> listar();
    public Optional<Personas> listId(int id);
    public int save (Personas p);
    public void delete(int id);

}
