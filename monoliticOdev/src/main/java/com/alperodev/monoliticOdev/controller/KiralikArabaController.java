package com.alperodev.monoliticOdev.controller;


import com.alperodev.monoliticOdev.repository.entity.KiralikAraba;
import com.alperodev.monoliticOdev.service.KiralikArabaService;
import com.alperodev.monoliticOdev.service.SatilikArabaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//http://localhost:9090/SatilikAraba/save?marka=Bmw&model=X5&kacModel=2020&fiyat=1000000
@RestController
@RequestMapping("/kiralikAraba")
@RequiredArgsConstructor
public class KiralikArabaController {


    private final KiralikArabaService kiralikArabaService;

    @GetMapping("/save")
    public ResponseEntity<Void> save(String marka,String model,int kacGunKiralanabilir,int kiralamaBedeli){
        kiralikArabaService.save(marka, model, kacGunKiralanabilir, kiralamaBedeli);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<KiralikAraba>> findAll(){
        List<KiralikAraba> result = kiralikArabaService.findAll();
        return ResponseEntity.ok(result);
    }
}
