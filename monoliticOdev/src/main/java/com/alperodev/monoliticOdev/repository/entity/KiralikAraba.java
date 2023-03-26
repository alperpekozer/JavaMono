package com.alperodev.monoliticOdev.repository.entity;


import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "tblkiralikaraba")
@Entity
public class KiralikAraba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String marka;
    String model;
    int kacGunKiralanabilir;
    int kiralamaBedeli;



}
