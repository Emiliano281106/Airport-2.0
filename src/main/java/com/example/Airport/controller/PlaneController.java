package com.example.Airport.controller;

import com.example.Airport.model.Plane;
import com.example.Airport.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Airport.repository.PlaneRepository;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @GetMapping("/{id}")
    public Plane getPlaneById(@PathVariable String id){

        return planeService.getPLaneById(id).orElse(null);
    }

    @PostMapping
    public Plane createPlane(@RequestBody Plane plane){

        return planeService.createPlane(plane);
    }

    @DeleteMapping
    public String deleteAllPlanes(){

        planeService.deleteAllPlanes();

        return "All planes deleted.";
    }

}
