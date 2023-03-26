package com.alperodev.monoliticOdev.service;

import com.alperodev.monoliticOdev.repository.view.ISatilikArabaRepository;
import com.alperodev.monoliticOdev.repository.entity.SatilikAraba;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SatilikArabaService {

    private final ISatilikArabaRepository repository;

    public void save(String marka,String model,int kacModel,int fiyat){
        repository.save(SatilikAraba.builder()
                        .marka(marka)
                        .model(model)
                        .fiyat(fiyat)
                        .kacModel(kacModel)
                .build());
    }

    public List<SatilikAraba> findAll() {
        return repository.findAll();
    }
}
