package com.example.pharmacymanagement.service;

import com.example.pharmacymanagement.entity.PharmacyEntity;
import com.example.pharmacymanagement.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PharmacyServiceImpl implements PharamacyService {

    @Autowired
    PharmacyRepository repository;


    @Override
    public List<PharmacyEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public PharmacyEntity createDrug(PharmacyEntity entity) {
        return repository.save(entity);

    }

    @Override
    public PharmacyEntity updateDrug(Long id, PharmacyEntity entity) {
        PharmacyEntity pharmacy = repository.findById(id)
                .orElseThrow(()->  new RuntimeException("Pharmacy not found with id: " + id));
        pharmacy.setDrugName(entity.getDrugName());
        pharmacy.setAvailableQuantity(entity.getAvailableQuantity());
        pharmacy.setBrandName(entity.getBrandName());
        return repository.save(pharmacy);
    }

    @Override
    public String deleteDrug(Long id) {
        repository.deleteById(id);
        return "The id you provided " + id + "is deleted";
    }
}
