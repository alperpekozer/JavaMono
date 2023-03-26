package com.alperodev.monoliticOdev.repository.entity;

import lombok.*;

import javax.persistence.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "tblsatilikaraba")
@Entity
public class SatilikAraba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String marka;
    String model;
    int kacModel;
    int fiyat;
}
