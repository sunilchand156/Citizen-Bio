package com.example.citizen.Repository;

import com.example.citizen.Entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository <Citizen,Long> {
    Citizen findByAadharId(String aadharId);
    Citizen findByPanId(String panId);
}
