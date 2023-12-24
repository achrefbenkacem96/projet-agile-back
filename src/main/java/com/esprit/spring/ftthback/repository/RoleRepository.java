package com.esprit.spring.ftthback.repository;

import com.esprit.spring.ftthback.models.Role;
import com.esprit.spring.ftthback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);


}
