package br.com.guru.springframework.petclinic.model;

import lombok.Data;

@Data
public class PetType extends BaseEntity {
    private String name;
}
