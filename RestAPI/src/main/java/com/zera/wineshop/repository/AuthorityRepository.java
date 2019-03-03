package com.zera.wineshop.repository;

import com.zera.wineshop.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority getByName(String name);
}
