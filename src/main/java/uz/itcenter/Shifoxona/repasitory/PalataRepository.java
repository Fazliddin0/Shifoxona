package uz.itcenter.Shifoxona.repasitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.Shifoxona.entity.Palata;

@Repository
public interface PalataRepository extends JpaRepository<Palata,Long> {
   Page<Palata> findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(String key ,String tur,String info, Pageable pageable);

}
