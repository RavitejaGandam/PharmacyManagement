package service;

import com.example.pharmacymanagement.entity.PharmacyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PharamacyService {

    public List<PharmacyEntity> getAll();
    public PharmacyEntity createDrug(PharmacyEntity entity);
    public PharmacyEntity updateDrug(Long id, PharmacyEntity entity);
    public String deleteDrug(Long id);
}
