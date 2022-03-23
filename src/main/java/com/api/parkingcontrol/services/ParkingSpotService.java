package com.api.parkingcontrol.services;

import com.api.parkingcontrol.respositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {


   final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
