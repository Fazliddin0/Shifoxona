package uz.itcenter.Shifoxona.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.impl.PalataService;
import uz.itcenter.Shifoxona.entity.Palata;
import uz.itcenter.Shifoxona.repasitory.PalataRepository;



@Service
public class PalataServiceImpl implements PalataService {
    @Autowired
    PalataRepository palataRepository;



    @Override
    public Page<Palata> findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(String key, String tur,String info,  Pageable pageable) {
        return palataRepository.findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(key,key,key,pageable);
    }

    @Override
    public Page<Palata> getAll(Pageable pageable) {
        return palataRepository.findAll(pageable);
    }

    @Override
    public Palata create(Palata palata) {
        return palataRepository.save(palata);
    }

    @Override
    public Palata update(Palata palata) {
        return palataRepository.save(palata);
    }

    @Override
    public void delete(Palata palata) {
    palataRepository.delete(palata);
    }

    @Override
    public void deleteById(Long id) {
    palataRepository.deleteById(id);
    }
}
