package uz.itcenter.Shifoxona.Service.impl;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.itcenter.Shifoxona.entity.Bemor;
import uz.itcenter.Shifoxona.entity.Palata;
import uz.itcenter.Shifoxona.entity.Shifokor;



public interface ShifokorService {
    public Page<Shifokor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif, Pageable pageable);

    public Page<Shifokor> getAll(Pageable pageable);
    public Shifokor create(Shifokor shifokor);
    public Shifokor update(Shifokor shifokor);
    public void delete(Shifokor shifokor);
    public void deleteById(Long id);


}