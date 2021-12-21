package uz.itcenter.Shifoxona.Service.impl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.itcenter.Shifoxona.entity.Kasallik;
import uz.itcenter.Shifoxona.entity.Palata;

import java.util.List;

public interface KasallikService {
    Page<Kasallik> findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(String key, String key1,  String key2, Pageable pageable);

    public Page<Kasallik> getAll(Pageable pageable);
    public Kasallik create(Kasallik kasallik);
    public Kasallik update(Kasallik kasallik);
    public void delete(Kasallik kasallik);
    public void deleteById(Long id);

}
