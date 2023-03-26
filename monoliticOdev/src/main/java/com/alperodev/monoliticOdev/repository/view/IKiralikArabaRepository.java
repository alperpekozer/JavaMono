package com.alperodev.monoliticOdev.repository.view;

import com.alperodev.monoliticOdev.repository.entity.KiralikAraba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKiralikArabaRepository extends JpaRepository<KiralikAraba,Long> {
}
