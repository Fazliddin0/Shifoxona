package uz.itcenter.Shifoxona.repasitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.Shifoxona.entity.Bemor;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface BemorRepository extends JpaRepository<Bemor, Long> {
    Page<Bemor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif, Pageable pageable);
}
