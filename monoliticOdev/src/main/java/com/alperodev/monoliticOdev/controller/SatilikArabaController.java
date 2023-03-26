package com.alperodev.monoliticOdev.controller;

import com.alperodev.monoliticOdev.repository.entity.SatilikAraba;
import com.alperodev.monoliticOdev.service.SatilikArabaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:9090/SatilikAraba/save?marka=Bmw&model=X5&kacModel=2020&fiyat=1000000
@RestController
@RequestMapping("/satilikAraba")
@RequiredArgsConstructor
public class SatilikArabaController {

    private final SatilikArabaService satilikArabaService;

    @GetMapping("/save")
    public ResponseEntity<Void> save(String marka,String model,int kacModel,int fiyat){
        satilikArabaService.save(marka, model, kacModel, fiyat);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<SatilikAraba>> findAll(){
        List<SatilikAraba> result = satilikArabaService.findAll();
        return ResponseEntity.ok(result);
    }
}
