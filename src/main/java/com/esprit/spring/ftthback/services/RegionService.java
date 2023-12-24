package com.esprit.spring.ftthback.services;

import com.esprit.spring.ftthback.models.Region;

import java.util.List;

public interface RegionService {
    List<Region> RetreiveAllRegion ();
    Region AddRegion (Region region);
    public void DeleteRegion(Long id);
    Region findById (Long id);
    Region updateRegion( Region region, Long id);
}
