package com.ajay.oath.practice.angularRest.repositories;

import com.ajay.oath.practice.angularRest.models.*;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {

    @Override
    void delete(Contact deleted);
}
