package uz.itcenter.Shifoxona.Service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.entity.Palata;


public interface PalataService {
    public Page<Palata> getAll(Pageable pageable);
    public Palata create(Palata palata);
    public Palata update(Palata palata);
    public void delete(Palata palata);
    public void deleteById(Long id);

    Page<Palata> findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(String key, String key1,  String key2, Pageable pageable);
}

