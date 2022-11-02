package Repositorios;

import Modelos.PermisosRol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRol extends MongoRepository<PermisosRol,String> {
}
