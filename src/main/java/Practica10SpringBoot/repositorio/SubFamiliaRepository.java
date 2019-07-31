package Practica10SpringBoot.repositorio;


import Practica10SpringBoot.entidades.Familia;
import Practica10SpringBoot.entidades.SubFamilia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vacax on 20/09/16.
 */
public interface SubFamiliaRepository extends JpaRepository<SubFamilia, Long> {



    List<SubFamilia> findAll();

    List<SubFamilia> findAllByFamilia(Familia id);

    SubFamilia findById(int id);


}
