package uz.itcenter.Shifoxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.itcenter.Shifoxona.Service.impl.KasallikService;
import uz.itcenter.Shifoxona.entity.Kasallik;
import uz.itcenter.Shifoxona.entity.Palata;

@RestController
@RequestMapping("/api/kasallik")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class KasallikController {

    @Autowired
    KasallikService kasallikService;
    @GetMapping
    public Page<Kasallik> getAll(@RequestParam(required = false) String key , String tur, String info, Pageable pageable){
        if(key == null) key = "";
        return kasallikService.findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(key,key,key, pageable);
    }

    @PostMapping
    public Kasallik create(@RequestBody Kasallik kasallik){
        return kasallikService.create(kasallik);
    }

    @PutMapping
    public Kasallik update(@RequestBody Kasallik kasallik){
        return kasallikService.update(kasallik);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        kasallikService.deleteById(id);
    }
}
