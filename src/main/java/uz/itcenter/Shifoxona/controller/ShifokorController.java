package uz.itcenter.Shifoxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import uz.itcenter.Shifoxona.Service.impl.ShifokorService;
import uz.itcenter.Shifoxona.entity.Bemor;
import uz.itcenter.Shifoxona.entity.Shifokor;

@RestController
@RequestMapping("/api/shifokor")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class ShifokorController {

    @Autowired
    ShifokorService shifokorService;
    @GetMapping

    public Page<Shifokor> getAll(@RequestParam(required = false) String key , String familiya, String sharif, Pageable pageable){
        if(key == null) key = "";
        return shifokorService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCase(key,key,key, pageable);
    }


    @PostMapping
    public Shifokor create(@RequestBody Shifokor shifokor){
        return shifokorService.create(shifokor);
    }

    @PutMapping
    public Shifokor update(@RequestBody Shifokor shifokor){
        return shifokorService.update(shifokor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        shifokorService.deleteById(id);
    }

}