package uz.itcenter.Shifoxona.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.impl.ShifokorService;
import uz.itcenter.Shifoxona.entity.Bemor;
import uz.itcenter.Shifoxona.entity.Shifokor;
import uz.itcenter.Shifoxona.repasitory.ShifokorRepository;



@Service
public class ShifokorServiceImpl implements ShifokorService {
        @Autowired
    ShifokorRepository shifokorRepository;

    @Override
    public Page<Shifokor> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(String key, String familiya, String sharif, Pageable pageable) {
        return shifokorRepository.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(key,key,key, pageable);
    }

    @Override
    public Page<Shifokor> getAll(Pageable pageable) {
        return shifokorRepository.findAll(pageable);
    }

    @Override
    public Shifokor create(Shifokor shifokor) {
        return shifokorRepository.save(shifokor);
    }

    @Override
    public Shifokor update(Shifokor shifokor) {
        return shifokorRepository.save(shifokor);
    }

    @Override
    public void delete(Shifokor shifokor) {
    shifokorRepository.delete(shifokor);
    }

    @Override
    public void deleteById(Long id) {
    shifokorRepository.deleteById(id);
    }
}
