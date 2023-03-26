package com.alperodev.monoliticOdev.repository.view;

import com.alperodev.monoliticOdev.repository.entity.SatilikAraba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISatilikArabaRepository extends JpaRepository<SatilikAraba,Long> {


}
