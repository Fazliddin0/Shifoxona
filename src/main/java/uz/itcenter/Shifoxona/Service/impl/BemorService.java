package uz.itcenter.Shifoxona.Service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.itcenter.Shifoxona.entity.Bemor;

import java.time.LocalDate;
import java.util.List;

public interface BemorService {
   public Page<Bemor> getAll(Pageable pageable);

    public Page<Bemor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif, Pageable pageable);
    public Bemor create(Bemor bemor);
    public Bemor update(Bemor bemor);
    public void delete(Bemor bemor);
    public void deleteById(Long id);
}
