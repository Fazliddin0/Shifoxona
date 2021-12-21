package uz.itcenter.Shifoxona.repasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.Shifoxona.entity.Davolanish;

@Repository
public interface DavolanishRepository extends JpaRepository<Davolanish, Long> {

}
