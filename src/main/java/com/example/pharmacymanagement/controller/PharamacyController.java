package com.example.pharmacymanagement.controller;

import com.example.pharmacymanagement.entity.PharmacyEntity;
import com.example.pharmacymanagement.service.PharamacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/pharamacyDetails")
public class PharamacyController {

    @Autowired
    PharamacyService service;

    @GetMapping("/allDrugs")
   public ResponseEntity<List<PharmacyEntity>> getAllDrugs(){
       List<PharmacyEntity> pharmacy = service.getAll();
       return ResponseEntity.ok(pharmacy);
   }

   @PostMapping("/addDrug")
   public PharmacyEntity addDrug(@RequestBody PharmacyEntity pharmacy){
        return service.createDrug(pharmacy);
   }
   @PutMapping("/updateDrug{id}")
   public PharmacyEntity updateDrug(@PathVariable Long id, @RequestBody PharmacyEntity pharmacy){
        return service.updateDrug(id,pharmacy);
   }

   @DeleteMapping("/deleteDrug{id}")
   public ResponseEntity<Void> deleteDrug(@PathVariable Long id){
        service.deleteDrug(id);
        return ResponseEntity.noContent().build();
   }

}
