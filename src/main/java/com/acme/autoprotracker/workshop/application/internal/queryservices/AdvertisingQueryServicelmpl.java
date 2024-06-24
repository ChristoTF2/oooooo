package com.acme.autoprotracker.workshop.application.internal.queryservices;

import com.acme.autoprotracker.workshop.domain.model.aggregates.Advertising;
import com.acme.autoprotracker.workshop.domain.model.queries.GetAdvertisingByIdQuery;
import com.acme.autoprotracker.workshop.domain.model.queries.GetAllAdvertisingQuery;
import com.acme.autoprotracker.workshop.domain.services.AdvertisingQueryService;
import com.acme.autoprotracker.workshop.infrastructure.persistence.jpa.repositories.AdvertisingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertisingQueryServicelmpl implements AdvertisingQueryService {

    private final AdvertisingRepository advertisingRepository;

    public AdvertisingQueryServicelmpl(AdvertisingRepository advertisingRepository) {
        this.advertisingRepository = advertisingRepository;
    }
    @Override
    public Optional<Advertising> handle(GetAdvertisingByIdQuery query) {
        return advertisingRepository.findById(query.id());
    }
    @Override
    public List<Advertising> handle(GetAllAdvertisingQuery query) {
        return advertisingRepository.findAll();
    }
}
