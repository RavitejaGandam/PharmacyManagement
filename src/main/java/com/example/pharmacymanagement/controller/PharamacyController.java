package com.example.pharmacymanagement.controller;

import com.example.pharmacymanagement.service.PharamacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/pharamacyDetails")
public class PharamacyController {

    @Autowired
    PharamacyService service;
}
