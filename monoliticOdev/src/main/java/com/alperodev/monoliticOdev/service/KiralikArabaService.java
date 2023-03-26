package com.alperodev.monoliticOdev.service;

import com.alperodev.monoliticOdev.repository.entity.KiralikAraba;
import com.alperodev.monoliticOdev.repository.view.IKiralikArabaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KiralikArabaService {


    private final IKiralikArabaRepository kiralikArabaRepository;

    public void save(String marka,String model,int kacGunKiralanabilir, int kiralamaBedeli){

        kiralikArabaRepository.save(KiralikAraba.builder()
                        .marka(marka)
                        .model(model)
                        .kacGunKiralanabilir(kacGunKiralanabilir)
                        .kiralamaBedeli(kiralamaBedeli)

                .build());
    }

    public List<KiralikAraba> findAll() {
        return kiralikArabaRepository.findAll();
    }
}
