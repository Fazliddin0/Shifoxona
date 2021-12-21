package uz.itcenter.Shifoxona.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import uz.itcenter.Shifoxona.Service.impl.DavolanishService;
import uz.itcenter.Shifoxona.entity.Davolanish;

import java.util.List;

@RestController
@RequestMapping("/api/davolanish")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class DavolanishController {

    @Autowired
    DavolanishService davolanishService;

    @GetMapping
    public Page<Davolanish> getAll(Pageable pageable){
        return davolanishService.getAll(pageable);
    }

    @PostMapping
    public Davolanish create(@RequestBody Davolanish davolanish){
        return davolanishService.create(davolanish);
    }

    @PutMapping
    public Davolanish update(@RequestBody Davolanish davolanish){
        return davolanishService.update(davolanish);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        davolanishService.deleteById(id);
    }

}
