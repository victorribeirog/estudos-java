package org.example.apicurso.service;

import org.example.apicurso.domain.model.User;

public interface UserService {

    User findById(Long id);


    User create(User userToCreate);
}
