package uz.itcenter.Shifoxona.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.impl.BemorService;
import uz.itcenter.Shifoxona.entity.Bemor;

import uz.itcenter.Shifoxona.repasitory.BemorRepository;

import java.time.LocalDate;
import java.util.Date;

@Service
public class BemorServiceImpl implements BemorService {

    @Autowired
    BemorRepository bemorRepository;




    @Override
    public Page<Bemor> getAll(Pageable pageable) {
        return bemorRepository.findAll(pageable);
    }


    @Override
    public Page<Bemor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif,  Pageable pageable) {
        return bemorRepository.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(key,key,key, pageable);
    }

    @Override
    public Bemor create(Bemor bemor) {
        return bemorRepository.save(bemor);
    }

    @Override
    public Bemor update(Bemor bemor) {
        return bemorRepository.save(bemor);
    }

    @Override
    public void delete(Bemor bemor) {
    bemorRepository.delete(bemor);
    }

    @Override
    public void deleteById(Long id) {
    bemorRepository.deleteById(id);
    }
}
