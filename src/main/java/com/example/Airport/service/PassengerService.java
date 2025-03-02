package com.example.Airport.service;

import com.example.Airport.model.Passenger;
import com.example.Airport.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllPassengers(){

        return passengerRepository.findAll();
    }

    public Optional <Passenger> getPassengerById(String Id){

        return passengerRepository.findById(Id);

    }

    public void deleteById(String Id){

        passengerRepository.deleteById(Id);
    }

    public Passenger createPassenger(Passenger passenger){

        return passengerRepository.save(passenger);
    }

    public void deleteAllPassengers(){

        passengerRepository.deleteAll();
    }
}