package uz.itcenter.Shifoxona.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.impl.DavolanishService;
import uz.itcenter.Shifoxona.entity.Davolanish;
import uz.itcenter.Shifoxona.repasitory.DavolanishRepository;

import java.util.List;
@Service
public class DavolanishServiceImpl implements DavolanishService {
    @Autowired
    DavolanishRepository davolanishRepository;
    @Override
    public Page<Davolanish> getAll(Pageable pageable) {
        return davolanishRepository.findAll(pageable);
    }

    @Override
    public Davolanish create(Davolanish davolanish) {
        return davolanishRepository.save(davolanish);
    }

    @Override
    public Davolanish update(Davolanish davolanish) {
        return davolanishRepository.save(davolanish);
    }

    @Override
    public void delete(Davolanish davolanish) {
    davolanishRepository.delete(davolanish);
    }

    @Override
    public void deleteById(Long id) {
    davolanishRepository.deleteById(id);
    }
}
