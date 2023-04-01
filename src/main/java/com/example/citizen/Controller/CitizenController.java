package com.example.citizen.Controller;

import com.example.citizen.Entity.Citizen;
import com.example.citizen.Service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizens")
public class CitizenController {
@Autowired
    private CitizenService citizenService;

@PostMapping
    public Citizen addCitizen (@RequestBody Citizen citizen)
{
    return citizenService.addCitizen(citizen);
}

@GetMapping("/{aadharId}")
    public Citizen getCitizenByAadharId(@PathVariable String aadharId)
{
    return citizenService.getCitizenByAadharId(aadharId);
}

@GetMapping("/pan/{panId}")

public Citizen getCitizenByPanId(@PathVariable String panId)
{return citizenService.getCitizenByPanId(panId);
}

@PutMapping("/{aadharId}")
    public Citizen updateCitizenName(@PathVariable String aadharId, @RequestBody String name){
    return citizenService.updateCitizenName (aadharId,name);
}
}