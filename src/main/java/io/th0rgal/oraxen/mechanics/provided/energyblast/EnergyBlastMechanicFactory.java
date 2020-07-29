package io.th0rgal.oraxen.mechanics.provided.energyblast;

import io.th0rgal.oraxen.Oraxen;
import io.th0rgal.oraxen.mechanics.Mechanic;
import io.th0rgal.oraxen.mechanics.MechanicFactory;
import io.th0rgal.oraxen.mechanics.MechanicsManager;
import org.bukkit.configuration.ConfigurationSection;

public class EnergyBlastMechanicFactory extends MechanicFactory {
    public EnergyBlastMechanicFactory(ConfigurationSection section) {
        super(section);
        MechanicsManager.registerListeners(Oraxen.get(), new EnergyBlastMechanicManager(this));
    }

    @Override
    public Mechanic parse(ConfigurationSection itemMechanicConfiguration) {
        Mechanic mechanic = new EnergyBlastMechanic(this, itemMechanicConfiguration);
        addToImplemented(mechanic);
        return mechanic;
    }
}
