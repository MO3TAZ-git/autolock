package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public List<Maintenance> retrieveAllMaintenances();

    public Maintenance retrieveMaintenance(Long idMaintenance);
    public Maintenance addMaintenance(Maintenance a);

    public Maintenance modifierMaintenance(Maintenance a);

    public void removeMaintenance(Long id);
}
