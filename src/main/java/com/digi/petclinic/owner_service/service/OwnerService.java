package com.digi.petclinic.owner_service.service;

import com.digi.petclinic.owner_service.dao.OwnerRepository;
import com.digi.petclinic.owner_service.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    List<Owner> findAllOwner(){

        return ownerRepository.findAll();
    }
}
