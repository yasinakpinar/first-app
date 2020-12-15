package com.akpinar.firstapp.service.impl;

import com.akpinar.firstapp.entities.Emplooye;
import com.akpinar.firstapp.repository.EmplooyeRepository;
import com.akpinar.firstapp.service.EmplooyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplooyeServiceImpl implements EmplooyeService {

    @Autowired
    private EmplooyeRepository emplooyeRepository;


    @Override
    public Emplooye save(Emplooye emplooye) {

        return emplooyeRepository.save(emplooye);
    }


    @Override
    public List<Emplooye> findAllEmplooye() {

        return emplooyeRepository.findAll();
    }

    @Override
    public Boolean deleteByIdEmplooye(int id) {

        Optional<Emplooye> emplooye = emplooyeRepository.findById(id);
        if (emplooye.isEmpty() == true) {
            return Boolean.FALSE;
        }

        emplooyeRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public Emplooye updateByIdEmplooye(Emplooye emplooye, int id) {
          Optional<Emplooye> emplooyeOptional = emplooyeRepository.findById(id);
            if (emplooyeOptional.isEmpty()==true){

                return null;
            }

            emplooyeOptional.get().setName(emplooye.getName());
            emplooyeOptional.get().setSurname(emplooye.getSurname());
            emplooyeOptional.get().setAddress(emplooye.getAddress());

        return emplooyeRepository.save(emplooyeOptional.get());
    }
}
