
package com.example.Airport.service;

import com.example.Airport.model.Airport;
import com.example.Airport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAllAirports(){

        return airportRepository.findAll();
    }

    public Airport createAirport(Airport airport){
        return airportRepository.save(airport);
    }

    public Optional <Airport> getAirportById(String Id){

        return airportRepository.findById(Id);
    }

    public void deleteAirport(String Id){

        airportRepository.deleteById(Id);

    }

    public void deleteAllAirports(){

        airportRepository.deleteAll();
    }
}