package com.akpinar.firstapp.controller;

import com.akpinar.firstapp.entities.Emplooye;
import com.akpinar.firstapp.service.EmplooyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emplooye")
public class EmplooyeController {

    @Autowired
    private EmplooyeService emplooyeService;


    @PostMapping(value = "/addEmplooye")
    public Emplooye createEmplooye(@RequestBody Emplooye emplooye) {

        return emplooyeService.save(emplooye);
    }


    @GetMapping(value = "/findAllEmplooye")
    public List<Emplooye> findAllEmplooye() {

        return emplooyeService.findAllEmplooye();
    }

    @DeleteMapping("/deleteByIdEmplooye/{id}")
    public Boolean deleteByIDEmplooye(@PathVariable("id") int id) {

        return emplooyeService.deleteByIdEmplooye(id);
    }

    @PutMapping ("/updateByIdEmplooye/{id}")
    public Emplooye updateByIdEmplooye(@RequestBody Emplooye emplooye,@PathVariable("id") int id){
        System.out.println("test");

        return emplooyeService.updateByIdEmplooye(emplooye,id);
    }


}
