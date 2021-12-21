package uz.itcenter.Shifoxona.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.itcenter.Shifoxona.Service.impl.PalataService;
import uz.itcenter.Shifoxona.entity.Palata;



@RestController
@RequestMapping("/api/palata")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class PalataController {
    @Autowired
    PalataService palataService;
    @GetMapping

    public Page<Palata> getAll(@RequestParam(required = false) String key ,String tur,String info, Pageable pageable){
        if(key == null) key = "";
        return palataService.findAllByNomContainsIgnoreCaseOrTurContainsIgnoreCaseOrInfoContainsIgnoreCase(key,key,key, pageable);
    }

    @PostMapping
    public Palata create(@RequestBody Palata palata){
        return palataService.create(palata);
    }

    @PutMapping
    public Palata update(@RequestBody Palata palata){
        return palataService.update(palata);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        palataService.deleteById(id);
    }
}
