package Practica10SpringBoot.repositorio;


import Practica10SpringBoot.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vacax on 20/09/16.
 */
public interface RolRepository extends JpaRepository<Rol, Long> {



    List<Rol> findAll();

    List<Rol> findAllByUsuario(String usuario);


}
