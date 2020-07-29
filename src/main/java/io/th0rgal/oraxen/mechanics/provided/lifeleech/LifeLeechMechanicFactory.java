package io.th0rgal.oraxen.mechanics.provided.lifeleech;

import io.th0rgal.oraxen.Oraxen;
import io.th0rgal.oraxen.mechanics.Mechanic;
import io.th0rgal.oraxen.mechanics.MechanicFactory;
import io.th0rgal.oraxen.mechanics.MechanicsManager;

import org.bukkit.configuration.ConfigurationSection;

public class LifeLeechMechanicFactory extends MechanicFactory {

    public LifeLeechMechanicFactory(ConfigurationSection section) {
        super(section);
        MechanicsManager.registerListeners(Oraxen.get(), new LifeLeechMechanicListener(this));
    }

    @Override
    public Mechanic parse(ConfigurationSection itemMechanicConfiguration) {
        Mechanic mechanic = new LifeLeechMechanic(this, itemMechanicConfiguration);
        addToImplemented(mechanic);
        return mechanic;
    }

}
