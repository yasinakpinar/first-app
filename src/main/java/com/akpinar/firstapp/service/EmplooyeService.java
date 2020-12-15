package com.akpinar.firstapp.service;

import com.akpinar.firstapp.entities.Emplooye;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmplooyeService {

    Emplooye save(Emplooye emplooye);

    List<Emplooye> findAllEmplooye();

    Boolean deleteByIdEmplooye(int id);

    Emplooye updateByIdEmplooye(Emplooye emplooye, int id);



}
