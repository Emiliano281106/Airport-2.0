package com.example.Airport.controller;

import com.example.Airport.model.Passenger;
import com.example.Airport.repository.PassengerRepository;
import com.example.Airport.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @GetMapping
    public List<Passenger>getAllPassengers() {

        return passengerService.getAllPassengers();
    }

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable String id){

        return passengerService.getPassengerById(id).orElse(null);
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger){

        return passengerService.createPassenger(passenger);
    }

    @DeleteMapping
    public String deleteAllPassengers(){

        passengerService.deleteAllPassengers();

        return "All passengers deleted";
    }
}

