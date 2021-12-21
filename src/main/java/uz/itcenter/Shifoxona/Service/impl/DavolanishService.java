package uz.itcenter.Shifoxona.Service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.itcenter.Shifoxona.entity.Bemor;
import uz.itcenter.Shifoxona.entity.Davolanish;

import java.util.List;

public interface DavolanishService {
    public Page<Davolanish> getAll(Pageable pageable);
    public Davolanish create(Davolanish davolanish);
    public Davolanish update(Davolanish davolanish);
    public void delete(Davolanish davolanish);
    public void deleteById(Long id);
}
