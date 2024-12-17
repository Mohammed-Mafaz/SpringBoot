package com.quad.project.uber.uberApp.strategies.Impl;

import com.quad.project.uber.uberApp.entities.RideRequest;
import com.quad.project.uber.uberApp.service.DistanceService;
import com.quad.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    private static final double SURGE_FACTOR = 2;
    /*
     Suggestion : can call free weather api to see if it is raining at particular location , then surge the price .
     can have multiple if else condition.
    */

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER * SURGE_FACTOR;
    }
}