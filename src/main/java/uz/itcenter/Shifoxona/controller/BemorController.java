package uz.itcenter.Shifoxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.itcenter.Shifoxona.Service.impl.BemorService;
import uz.itcenter.Shifoxona.entity.Bemor;


import java.time.LocalDate;


@RestController
@RequestMapping("/api/bemor")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class BemorController {

    @Autowired
    BemorService bemorService;


    @GetMapping
    public Page<Bemor> getAll(@RequestParam(required = false) String key ,String familiya, String sharif, Pageable pageable){
        if(key == null) key = "";   
        return bemorService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(key,key,key, pageable);
    }

    @PostMapping
    public Bemor create(@RequestBody Bemor bemor){
        return bemorService.create(bemor);
    }

    @PutMapping
    public Bemor update(@RequestBody Bemor bemor){
        return bemorService.update(bemor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
       bemorService.deleteById(id);
    }

}