package uz.itcenter.Shifoxona.repasitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.Shifoxona.entity.Bemor;
import uz.itcenter.Shifoxona.entity.Shifokor;

@Repository
public interface ShifokorRepository extends JpaRepository <Shifokor, Long> {
    Page<Shifokor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif, Pageable pageable);

}
