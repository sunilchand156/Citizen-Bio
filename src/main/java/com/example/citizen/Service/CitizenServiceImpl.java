package com.example.citizen.Service;

import com.example.citizen.Entity.Citizen;
import com.example.citizen.Repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public Citizen addCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen getCitizenByAadharId(String aadharId) {
        return citizenRepository.findByAadharId(aadharId);
    }

    @Override
    public Citizen getCitizenByPanId(String panId) {
        return citizenRepository.findByPanId(panId);
    }

    @Override
    public Citizen updateCitizenName( String aadharId, String name ){
        Citizen citizen= citizenRepository.findByAadharId(aadharId);
citizen.setName(name);
return citizenRepository.save(citizen);

    }





}
