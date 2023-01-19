package br.com.guru.springframework.petclinic.service;

import br.com.guru.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
