package com.acme.autoprotracker.workshop.domain.services;

import com.acme.autoprotracker.workshop.domain.model.aggregates.Advertising;
import com.acme.autoprotracker.workshop.domain.model.commands.CreateAdvertisingCommand;
import com.acme.autoprotracker.workshop.domain.model.commands.DeleteAdvertisingCommand;
import com.acme.autoprotracker.workshop.domain.model.commands.UpdateAdvertisingCommand;

import java.util.Optional;

public interface AdvertisingCommandService {
    Long handle(CreateAdvertisingCommand command);
    Optional<Advertising> handle(UpdateAdvertisingCommand command);
    void handle(DeleteAdvertisingCommand command);
}
