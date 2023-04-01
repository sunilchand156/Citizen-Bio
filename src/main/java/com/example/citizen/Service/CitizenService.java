package com.example.citizen.Service;

import com.example.citizen.Entity.Citizen;

public interface CitizenService {
    Citizen addCitizen(Citizen citizen);
    Citizen getCitizenByAadharId (String aadharId );
    Citizen getCitizenByPanId(String panId);
    Citizen updateCitizenName(String aadharId, String name);

}
