package be.icc.reservation.service;

import be.icc.reservation.entity.Locations;

public interface LocationsService {

    Locations findById(Integer id);

    void save(Locations newLocation);
}
