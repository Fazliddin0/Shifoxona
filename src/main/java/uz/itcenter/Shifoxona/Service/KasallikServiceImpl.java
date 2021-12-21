package uz.itcenter.Shifoxona.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.impl.KasallikService;
import uz.itcenter.Shifoxona.entity.Kasallik;
import uz.itcenter.Shifoxona.entity.Palata;
import uz.itcenter.Shifoxona.repasitory.KasallikRepository;

@Service
public class KasallikServiceImpl implements KasallikService {
    @Autowired
    KasallikRepository kasallikRepository;


    @Override
    public Page<Kasallik> findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(String key, String tur,  String info, Pageable pageable) {
        return kasallikRepository.findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(key,key,key,pageable);
    }

    @Override
    public Page<Kasallik> getAll(Pageable pageable) {
        return kasallikRepository.findAll(pageable);
    }

    @Override
    public Kasallik create(Kasallik kasallik) {
        return kasallikRepository.save(kasallik);
    }

    @Override
    public Kasallik update(Kasallik kasallik) {
        return kasallikRepository.save(kasallik);
    }

    @Override
    public void delete(Kasallik kasallik) {
    kasallikRepository.delete(kasallik);
    }

    @Override
    public void deleteById(Long id) {
    kasallikRepository.deleteById(id);
    }
}
